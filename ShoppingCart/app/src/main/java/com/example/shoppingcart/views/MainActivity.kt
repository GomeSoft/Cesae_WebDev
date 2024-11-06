package com.example.shoppingcart.views

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shoppingcart.adapter.ShoppingCartListAdapter
import com.example.shoppingcart.data.ShoppingCartMock
import com.example.shoppingcart.databinding.ActivityMainBinding
import com.example.shoppingcart.model.Product

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var shoppingCartList = ArrayList<Product>()

        var newshoppingCartList = ShoppingCartMock().shoppingCartList

        binding.recyclerShoppingCart.layoutManager = LinearLayoutManager(this)

        //binding.recyclerShoppingCart.adapter = ShoppingCartListAdapter(ShoppingCartMock().shoppingCartList)

        binding.recyclerShoppingCart.adapter = ShoppingCartListAdapter(newshoppingCartList)


        binding.buttonAdicionarProduto.setOnClickListener {
            val newBarCode:Int = binding.editNovoCodigo.text.toString().toInt()
            val newProduct:String = binding.editNovoProduto.text.toString()
            val newPrice: Double = binding.editNovoPreco.text.toString().toDouble()
            val newPeso: Double = binding.editNovoPeso.text.toString().toDouble()

            newshoppingCartList.add(Product(newBarCode, newProduct, newPrice, newPeso))
            binding.recyclerShoppingCart.adapter = ShoppingCartListAdapter(newshoppingCartList)

        }

        binding.buttonTotalPreco.setOnClickListener {

            var total:Double = 0.0

            for (i in 0..< newshoppingCartList.size){
                total += newshoppingCartList.get(i).preco
            }
            Toast.makeText(this, "${total} €", Toast.LENGTH_SHORT).show()

        }

    }
}