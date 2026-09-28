package com.example.newpr01.data

data class TodosResponse(
    val todos: List<Todos>,
    val total: Int,
    val skip: Int,
    val limit: Int
)