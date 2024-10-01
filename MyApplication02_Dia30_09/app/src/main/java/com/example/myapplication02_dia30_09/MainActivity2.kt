package com.example.myapplication02_dia30_09

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication02_dia30_09.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private val binding by lazy{
        ActivityMain2Binding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val i = intent

        val nome = i.extras?.getString("nome")
        val sobrenome = i.extras?.getString("sobrenome")
        val numero = i.extras?.getString("numero")
        val morada = i.extras?.getString("morada")
        val email = i.extras?.getString("email")
        binding.textView.text = "olá ${nome} ${sobrenome} mora na rua do ${morada}, tem o telefone ${numero}, e o email ${email} "
    }
}