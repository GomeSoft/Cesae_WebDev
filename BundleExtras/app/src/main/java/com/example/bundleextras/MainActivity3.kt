package com.example.bundleextras

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bundleextras.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        val i = intent
        val numero1 = i.extras?.getInt("numero1")
        val numero2 = i.extras?.getInt("numero2")
        // val soma = numero1!! + numero2!! OU poderia ser também
        if (numero1 != null && numero2 != null ){
            val soma = numero1 + numero2
            binding.editResultado.setText("Soma: ${soma}")
        }else{
            binding.editResultado.setText("Erro ao passar os valores!")
        }


    }
}