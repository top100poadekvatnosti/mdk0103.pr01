package com.example.newpr01.viewmodel

import com.example.newpr01.data.Products
import com.example.newpr01.retrofit.RetrofitClient
import com.example.newpr01.service.ProductsInterface
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class ProductViewModel: ViewModel() {
    fun fetchAndUpdateProduct() {
        viewModelScope.launch {
            try {
                val productID = 25
                val product = RetrofitClient.productApi.getProduct(productID)
                Log.d(
                    "ProductViewModel: updateProduct",
                            "Идентификатор -> ${product.id}\n" +
                            "Название -> ${product.name}\n" +
                            "Цена -> ${product.price}\n" +
                            "Категория -> ${product.category}\n" +
                            "Количество -> ${product.quantity}\n"
                )

                val newProducts = product.copy(
                    name = "Офисное кресло Comfort-Т",
                    price = 14200.00,
                    category = "Офисная мебель",
                    quantity = 3
                )
                if (newProducts.id != null) {
                    val updateProducts =
                        RetrofitClient.productApi.updateProduct(newProducts.id, newProducts)
                    Log.d(
                        "ProductViewModel: updateProducts",
                                "Идентификатор -> ${newProducts.id}\n" +
                                "Название -> ${newProducts.name}\n" +
                                "Цена -> ${newProducts.price}\n" +
                                "Категория -> ${newProducts.category}\n" +
                                "Количество -> ${newProducts.quantity}\n"
                    )

                }
            } catch (ex: Exception) {
                Log.e("ProductViewModel: fetchProduct", ex.message.toString())
            }
        }
    }
}