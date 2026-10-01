package com.example.newpr01.service

import com.example.newpr01.data.Products
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path

interface ProductsInterface {
    @GET("products/{id}")
    suspend fun getProduct(@Path("id") productId: Int): Products

    @PUT("products/{id}")
    suspend fun updateProduct(@Path("id") productId: Int, @Body products: Products): Products
}