package com.example.ex01

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.ex01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //Evento click botão
        binding.buttonJuntar.setOnClickListener{

            val editName: String = binding.editName.text.toString()
            val editSurname: String = binding.editSurname.text.toString()

            if (editName.isNullOrEmpty() || editSurname.isNullOrEmpty()){
                /*binding.result.text = */
                Toast.makeText(this,"Campos não inseridos", Toast.LENGTH_SHORT).show();
            }
            else{
                binding.result.text = "Olá $editName $editSurname"
            }
        }

    }
}