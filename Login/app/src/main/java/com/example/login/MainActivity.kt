package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val auth by lazy { FirebaseAuth.getInstance() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonLogin.setOnClickListener {
            val email = binding.editEmail.text.toString()
            val pass = binding.editPassword.text.toString()

            auth.signInWithEmailAndPassword(email, pass)
                .addOnSuccessListener{
                    if (auth.currentUser?.isEmailVerified == true) {
                        Toast.makeText(this, "Login OK", Toast.LENGTH_SHORT).show()
                        val i = Intent(this, PerfilActivity::class.java)
                        startActivity(i)
                    }else{
                        Toast.makeText(this, "Conta não valida", Toast.LENGTH_SHORT).show()

                    }

                }
                .addOnFailureListener{
                    Toast.makeText(this, "Erro no login: ${it.message}", Toast.LENGTH_SHORT).show()
                }
        }

        binding.textCriarConta.setOnClickListener{
            val i = Intent(this, RegistoActivity::class.java)
            startActivity(i)
        }

        binding.textRecuperarPassword.setOnClickListener{
            val i = Intent(this, RecuperarPassword::class.java)
            startActivity(i)
        }



    }
}