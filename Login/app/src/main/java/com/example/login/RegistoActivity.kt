package com.example.login

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.ActivityRegistoBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class RegistoActivity : AppCompatActivity() {
    private  val binding by lazy { ActivityRegistoBinding.inflate(layoutInflater) }
    private val auth by lazy { FirebaseAuth.getInstance() }
    private  val db by lazy { FirebaseFirestore.getInstance() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonRegisto.setOnClickListener {
            val email = binding.editEmail.text.toString()
            val pass = binding.editPassword.text.toString()

            auth.createUserWithEmailAndPassword(email, pass)
                .addOnSuccessListener{
                    Toast.makeText(this, "Registo realizado com sucesso", Toast.LENGTH_SHORT).show()
                    auth.currentUser?.sendEmailVerification()
                    gravarUtilizadorDB(email)
                    finish()
            }
                .addOnFailureListener{
                    Toast.makeText(this, "Erro ao registar utilizador", Toast.LENGTH_SHORT).show()
                }


        }
    }
    private fun gravarUtilizadorDB(email: String){
        val uid = auth.currentUser?.uid
        val dados = mapOf(
            "nome" to "",
            "email" to email
        )

        db.collection("utilizadores")
            .document(uid.toString())
            .set(dados)
            .addOnSuccessListener {

            }
            .addOnFailureListener{

            }
    }
}