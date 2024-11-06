package com.example.shoppingcart.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppingcart.R
import com.example.shoppingcart.model.Product

class ShoppingCartListAdapter(val shoppingCartList: ArrayList<Product>):
    RecyclerView.Adapter<ShoppingCartListAdapter.ShoppingCartViewHolder>(){

    class ShoppingCartViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView){
        val textViewNome: TextView = itemView.findViewById(R.id.text_descricao_produto)
        val textViewPreco: TextView = itemView.findViewById(R.id.text_preco_produto)
        val textViewPeso: TextView = itemView.findViewById(R.id.text_peso_produto)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingCartViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_shopping_cart_list, parent, false)

        return ShoppingCartViewHolder(view)
    }

    override fun getItemCount(): Int {
        return shoppingCartList.size
    }

    override fun onBindViewHolder(holder: ShoppingCartViewHolder, position: Int) {
        val product = shoppingCartList[position]
        holder.textViewNome.setText(product.nome)
        holder.textViewPreco.setText(product.peso.toString())
        holder.textViewPeso.setText(product.preco.toString())
    }

}