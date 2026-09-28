package com.example.newpr01.services

import androidx.annotation.BoolRes
import com.example.newpr01.data.TodosResponse
import retrofit2.http.GET

interface TodoInterface {
    @GET("todos")
    suspend fun getAllTodos(): TodosResponse
}