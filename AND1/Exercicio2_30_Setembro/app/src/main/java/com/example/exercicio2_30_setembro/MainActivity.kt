package com.example.exercicio2_30_setembro

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicio2_30_setembro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonIr.setOnClickListener{
            val editUser: String = binding.editUser.text.toString()
            if (editUser.isNullOrEmpty()){
                Toast.makeText(this, "Campos não inseridos", Toast.LENGTH_SHORT).show();
            }
            else
            {
                val nome = binding.editUser.text.toString()
                intent.putExtra("nome", nome)
                val intent = Intent(this, MainActivity2 ::class.java)
                intent.putExtra("nome", nome)
                startActivity(intent)
            }

        }

    }
}