package com.example.myapplication4cbs

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication4cbs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val nome = binding.editName.text.toString().trim()
            val sobrenome = binding.editSurname.text.toString().trim()
             if(nome.isEmpty() || sobrenome.isEmpty()) {
                 binding.textResultado.text = "Não inserido!"
                 Toast.makeText(applicationContext, "Não Inserido!", Toast.LENGTH_SHORT).show()
             }else{
                 binding.textResultado.text = "Olá ${nome} ${sobrenome}"
                 Toast.makeText(applicationContext, "Olá ${nome} ${sobrenome}!", Toast.LENGTH_SHORT).show()
             }

        }

    }
}