package com.example.newpr01.data

import androidx.compose.ui.graphics.FilterQuality

data class Products(
    val id: Int? = null,
    val name: String,
    val price: Int,
    val category: String,
    val quantity: Int
)
