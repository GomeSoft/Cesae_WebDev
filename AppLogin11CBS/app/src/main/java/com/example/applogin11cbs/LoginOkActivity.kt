package com.example.applogin11cbs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.applogin11cbs.databinding.ActivityLoginOkBinding

class LoginOkActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginOkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginOkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogout.setOnClickListener {
            finish()
        }

    }
}