package com.example.newpr01.data

data class Posts(
    val name: String,
    val text: String,
    val userId: Int,
    val tag: List<Tags>
)
