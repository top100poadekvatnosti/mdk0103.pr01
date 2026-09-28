package com.example.newpr01.service

import com.example.newpr01.data.Quote
import retrofit2.http.Body
import retrofit2.http.POST

interface QuoteInterface {
    @POST("quotes/add")
    suspend fun  addQuote(@Body quote: Quote): Quote
}