package com.example.exercicioslistas

import Utilizador
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicioslistas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val listaNumeros = ArrayList<Int>()
        listaNumeros.add(2)
        listaNumeros.add(4)
        listaNumeros.add(6)
        listaNumeros.add(8)
        listaNumeros.add(10)
        listaNumeros.add(12)
        //listaNumeros.get(0)
        //listaNumeros.remove(10)
        //val tamanho = listaNumeros.size
        //listaNumeros.clear()

        val  arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaNumeros)
        binding.listView.adapter = arrayAdapter

        binding.listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Clicado em ${listaNumeros.get(position)}", Toast.LENGTH_SHORT).show()
        }


        val listaUtilizadores = ArrayList<Utilizador>()
        listaUtilizadores.add(Utilizador("user","pass"))
        listaUtilizadores.add(Utilizador("user1","pass1"))
        listaUtilizadores.add(Utilizador("user2","pass2"))
        listaUtilizadores.add(Utilizador("admin","pwd123"))





    }
}