package com.example.newpr01.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newpr01.retrofit.RetrofitClient
import kotlinx.coroutines.launch

class RecipeViewModel: ViewModel() {
    fun deleteRecipeById(recipeId: Int){
        viewModelScope.launch {
            try {
                val delRecipe = RetrofitClient.recipeApi.deleteRecipe(recipeId)
                Log.d("RecipeViewModel", "${delRecipe.id} ---- ${delRecipe.isDeleted} ----- ${delRecipe.deletedOn}")
            } catch (ex: Exception) {
                Log.e("RecipeViewModel: fetchRecipe", ex.message.toString())
            }
        }
    }
}