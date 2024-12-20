package com.example.applogin11cbs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.applogin11cbs.databinding.ActivityLoginErradoBinding

class LoginErradoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginErradoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginErradoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogout.setOnClickListener {
            finish()
        }

    }
}