package com.example.app30_09

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.app30_09.databinding.ActivityMainBinding
import java.text.DecimalFormat //Biblioteca importada para cortar as casas decimais na linha 33

class MainActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonKZ.setOnClickListener{
            val euros:Double = binding.editValorEuros.text.toString().toDouble()
            val valorConvertido:Double = euros * 1300
            binding.textResultado.text = "$valorConvertido Kz"
        }

        binding.buttonReal.setOnClickListener{
            val euros:Double = binding.editValorEuros.text.toString().toDouble()
            val valorConvertido:Double = euros * 6.10
            binding.textResultado.text = "$valorConvertido Reais"
        }

        binding.buttonDolar.setOnClickListener{
            val euros:Double = binding.editValorEuros.text.toString().toDouble()
            val valorConvertido:Double = euros * 1.12
            val formato = DecimalFormat("#.00")
            binding.textResultado.text = "${formato.format(valorConvertido)} Reais"
        }

        binding.buttonLibra.setOnClickListener{
            val euros:Double = binding.editValorEuros.text.toString().toDouble()
            val valorConvertido:Double = euros * 0.83
            binding.textResultado.text = "$valorConvertido Libras"
        }

        binding.buttonFranco.setOnClickListener{
            val euros:Double = binding.editValorEuros.text.toString().toDouble()
            val valorConvertido:Double = euros * 0.94
            binding.textResultado.text = "$valorConvertido Francos"
        }

    }
}
