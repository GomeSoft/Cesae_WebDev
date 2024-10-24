package com.example.multiplasactivitya13cbs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.multiplasactivitya13cbs.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonVoltar.setOnClickListener {
            //startActivity(Intent(this, MainActivity::class.java))
            finish()
        }


    }
}