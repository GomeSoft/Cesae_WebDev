package com.example.login

import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.ActivityPerfilBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage

class PerfilActivity : AppCompatActivity() {
    private val binding by lazy { ActivityPerfilBinding.inflate(layoutInflater) }

    private val auth by lazy { FirebaseAuth.getInstance() }
    private val db by lazy { FirebaseFirestore.getInstance() }
    private val storage by lazy { FirebaseStorage.getInstance()}
    private val Picasso by lazy { FirebaseStorage.getInstance() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        loadData()

        val selecionaImagemGaleria =
            registerForActivityResult(ActivityResultContracts.GetContent()){
            binding.imageUtlizador.setImageURI(it)
                if (it != null){
                    val uid = auth.currentUser?.uid
                    storage.getReference("utilizadores").child(uid.toString())
                        .putFile(it)
                        .addOnSuccessListener{
                            it.metadata?.reference?.downloadUrl?.addOnSuccessListener{
                                Toast.makeText(this, "Download URL: ${it}", Toast.LENGTH_SHORT).show()

                                val dados = mapOf(
                                    "foto" to it,
                                )

                                db.collection("utilizadores")
                                    .document(uid.toString())
                                    .update(dados)
                                    .addOnSuccessListener {
                                        Toast.makeText(this, "Atualizado", Toast.LENGTH_SHORT).show()
                                    }
                                    .addOnFailureListener{
                                        Toast.makeText(this, "Erro a atualizar conta", Toast.LENGTH_SHORT).show()
                                    }
                            }
                        }
                }
        }

        binding.imageUtlizador.setOnClickListener{
            selecionaImagemGaleria.launch("image/*")
        }

        binding.buttonEditar.setOnClickListener {
            val uid = auth.currentUser?.uid
            val email = binding.editEmail.text.toString()
            val nome = binding.editNome.text.toString()

            val dados = mapOf(
                "email" to email,
                "nome" to nome
            )

            db.collection("utilizadores")
                .document(uid.toString())
                .update(dados)
                .addOnSuccessListener {
                    Toast.makeText(this, "Atualizado", Toast.LENGTH_SHORT).show()
                }
                .addOnFailureListener {
                    Toast.makeText(this, "Erro a Atualizar conta", Toast.LENGTH_SHORT).show()

                }

        }

        binding.buttonEliminar.setOnClickListener {
            val uid = auth.currentUser?.uid
            db.collection("utilizadores")
                .document(uid.toString())
                .delete()
                .addOnSuccessListener {
                    auth.currentUser?.delete()
                    Toast.makeText(this, "Conta eliminada com sucesso", Toast.LENGTH_SHORT).show()
                    finish()
                }
                .addOnFailureListener {
                    Toast.makeText(this, "Erro a eliminar conta", Toast.LENGTH_SHORT).show()

                }

        }

        binding.buttonLogout.setOnClickListener {
            auth.signOut()
            finish()

        }


    }

    private fun  loadData(){

        val uid = auth.currentUser?.uid

        db.collection("utilizadores").document(uid.toString()).get()
            .addOnSuccessListener {
                val email = it.data?.get("email")
                val nome = it.data?.get("nome")
                val foto = it.data?.get("foto").toString()

                if (foto.isNotEmpty()){
                    Picasso.get().load(foto).into(binding.imageUtlizador)
                }

                binding.editEmail.setText(email.toString())
                binding.editNome.setText(nome.toString())
            }
            .addOnFailureListener{

            }

    }
}