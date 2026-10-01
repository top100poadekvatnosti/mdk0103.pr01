package com.example.newpr01.service

import com.example.newpr01.data.Recipe
import retrofit2.http.DELETE
import retrofit2.http.Path

interface RecipeInterface {
    @DELETE("recipes/{id}")
    suspend fun deleteRecipe(@Path("id") recipeId: Int): Recipe
}