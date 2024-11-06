package com.example.shoppingcart.data

import com.example.shoppingcart.model.Product

class ShoppingCartMock {
    var shoppingCartList = ArrayList<Product>()

    init {
        shoppingCartList.add(Product(12345, "Panados", 6.9, 0.5))
        shoppingCartList.add(Product(11222, "Queijo", 15.5, 1.1))
        shoppingCartList.add(Product(12235, "Bacalhau", 50.0, 7.5))
        shoppingCartList.add(Product(12365, "Bolo Rei", 9.9, 0.9))
        shoppingCartList.add(Product(13456, "uvas", 6.9, 1.5))
        shoppingCartList.add(Product(13345, "Rojões", 16.9, 1.5))
        shoppingCartList.add(Product(12945, "Presunto", 15.5, 1.1))
        shoppingCartList.add(Product(13345, "Batatas", 5.5, 20.5))
        shoppingCartList.add(Product(12345, "Alface", 2.9, 1.0))
        shoppingCartList.add(Product(12375, "cebola", 3.5, 2.5))
        shoppingCartList.add(Product(12145, "Bolo de chocolate", 1.9, 2.5))
        shoppingCartList.add(Product(22345, "Rabanadas", 30.0, 5.5))
        shoppingCartList.add(Product(32345, "polvo", 60.9, 6.5))
        shoppingCartList.add(Product(42345, "Nozes", 5.9, 3.5))
        shoppingCartList.add(Product(52345, "Sumos", 3.9, 0.5))
        shoppingCartList.add(Product(62345, "vinho", 2.9, 0.5))
        shoppingCartList.add(Product(72345, "coca-cola", 6.9, 0.5))


    }
}