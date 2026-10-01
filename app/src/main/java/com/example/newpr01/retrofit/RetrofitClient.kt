package com.example.newpr01.retrofit

import com.example.newpr01.service.PostInterface
import com.example.newpr01.service.ProductsInterface
import com.example.newpr01.services.TodoInterface
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.InetSocketAddress
import java.net.Proxy

object RetrofitClient {
    //val proxy = Proxy(Proxy.Type.HTTP, InetSocketAddress("10.207.106.59", 3128))
    val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        //.proxy(proxy)
        .build()

    var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://dummyjson.com/")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val todoApi: TodoInterface = retrofit.create(TodoInterface::class.java)
    val postApi: PostInterface = retrofit.create(PostInterface::class.java)
    val productApi: ProductsInterface = retrofit.create(ProductsInterface::class.java)
}