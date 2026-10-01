package com.example.newpr01.data

data class Recipe(
    val id: Int,
    val isDeleted: Boolean = false,
    val deletedOn: String
)
