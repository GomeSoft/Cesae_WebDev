package com.example.myapplication19setembro

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication19setembro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        // Atenção a este passo -> binding.root

        binding.buttonIr.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

            // Ele está a passar diretamente, convém criar um botão para ser o user a escolher quando quer trocar de atividades
        }
    }
}