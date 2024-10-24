package com.example.conversordemoedasa9cbslinearlayout

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.conversordemoedasa9cbslinearlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonKz.setOnClickListener {
            escrever(1300.0)
        }
        binding.buttonDolar.setOnClickListener {
            escrever(0.8)
        }
        binding.buttonReal.setOnClickListener {
            escrever(5.0)
        }
    }

    private fun escrever(taxa:Double) {
        val euros = binding.editEuros.text.toString().trim()

        if (!euros.isEmpty()){
            val resultado = euros.toDouble() * taxa
            Toast.makeText(applicationContext, "${resultado}", Toast.LENGTH_SHORT).show()
            //binding.textResultado.setText("${kz}Kz")
        }
    }
}