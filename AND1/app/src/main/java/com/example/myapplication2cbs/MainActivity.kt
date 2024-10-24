package com.example.myapplication2cbs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication2cbs.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            val euros = binding.editEuros.text.toString().toDouble()
            //val kz = String.format("%2f", euros * 1300)
            val kz = (euros * 1300).roundToInt().toDouble()

            binding.textView.text = "${kz} Kz"
        }

    }
}