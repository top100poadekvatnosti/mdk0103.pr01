package com.example.newpr01.services

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import com.example.newpr01.data.*
import com.example.newpr01.service.RetrofitClient
import com.example.newpr01.service.*

class TodoViewModel: ViewModel() {
    fun fetchTodos(){
        viewModelScope.launch {
            try {
                val TodosResponse = RetrofitClient.todoApi.getAllTodos()
                val todos = TodosResponse.todos
                for (todo in todos){
                    Log.d("TodoViewModel", "Текст - ${todo.todo}  " + "Отметка о выполнении - ${todo.status}  ")
                }
            }
            catch (e: Exception){
                Log.e("TodoViewModel", "${e.message}")
            }
        }
    }

}