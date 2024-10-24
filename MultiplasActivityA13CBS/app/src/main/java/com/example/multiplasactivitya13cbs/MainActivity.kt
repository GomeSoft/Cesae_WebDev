package com.example.multiplasactivitya13cbs

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.multiplasactivitya13cbs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.butoonEntrar.setOnClickListener {
            //val i = Intent(this, ProfileActivity::class.java)
            //startActivity(i)

            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }
}