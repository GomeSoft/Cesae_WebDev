package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {

            val eurosUtilizador: Double = binding.editEurosUtilizador.text.toString().toDouble()
            val valorEuros = (eurosUtilizador * 1.1 * 100).roundToInt().toDouble() / 100
            binding.textDolares.text = "O valor à pagar é: $valorEuros€"

        }

    }
}