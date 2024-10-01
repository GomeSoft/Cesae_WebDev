package com.example.exercicio2_30_setembro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicio2_30_setembro.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private val binding by lazy {
        ActivityMain2Binding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)

        val i = intent

        val  nome = i.extras?.getString("nome")
        binding.textView2.text = "Olá ${nome}"

    }
}