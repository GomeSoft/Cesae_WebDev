package com.example.ex01_15_setembro

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ex01_15_setembro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.buttonIr.setOnClickListener {
            val intent = Intent(this, FullscreenActivity:: class.java)
            startActivity(intent)
        }

    }
}