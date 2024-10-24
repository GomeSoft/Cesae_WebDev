package com.example.linearlayoutcbs5aula8

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.linearlayoutcbs5aula8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)


    }
}