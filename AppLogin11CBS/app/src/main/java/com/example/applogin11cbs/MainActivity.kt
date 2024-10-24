package com.example.applogin11cbs

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.applogin11cbs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonEntrar.setOnClickListener {
            val username = binding.editUsername.text.toString().trim()
            val password = binding.editPassword.text.toString().trim()

            if (username.equals("user") && password.equals("pass")){
                Toast.makeText(applicationContext, "Entrou!", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, LoginOkActivity::class.java))
            }else{
                Toast.makeText(applicationContext, "Errou!", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, LoginErradoActivity::class.java))
            }
            binding.editUsername.setText("")
            binding.editPassword.setText("")
        }
    }
}