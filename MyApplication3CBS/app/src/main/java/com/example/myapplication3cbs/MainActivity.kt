package com.example.myapplication3cbs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication3cbs.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttonConverter.setOnClickListener {
            if(!binding.editValor.text.toString().isEmpty()){
                val valor = binding.editValor.text.toString().toDouble()
                val convertido = (valor * 1.8 + 32).roundToInt().toDouble()
                binding.textViewResultado.text =  "${convertido} ºF"


            }else{
                binding.textViewResultado.text =  "Temperatura Inválida!"
            }
        }

    }
}