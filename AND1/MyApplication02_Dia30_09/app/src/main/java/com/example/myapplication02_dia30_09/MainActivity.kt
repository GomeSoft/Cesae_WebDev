package com.example.myapplication02_dia30_09

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication02_dia30_09.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonIr.setOnClickListener {
            val nome = binding.editNome.text.toString()
            val intent = Intent(this,MainActivity2 ::class.java)
            intent.putExtra("nome", nome)

            val sobrenome = binding.editSobrenome.text.toString()
            intent.putExtra("sobrenome", sobrenome)

            val numero = binding.editTextPhone.text.toString()
            intent.putExtra("numero", numero)

            val morada = binding.editMorada.text.toString()
            intent.putExtra("morada", morada)

            val email = binding.editEmail.text.toString()
            intent.putExtra("email", email)

            startActivity(intent)

        }
    }
}