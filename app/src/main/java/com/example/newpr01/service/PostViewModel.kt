package com.example.newpr01.service


import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newpr01.data.Posts
import kotlinx.coroutines.launch

class PostViewModel: ViewModel() {
    fun createPost(posts: Posts) {
        viewModelScope.launch {
            try {
                val addedPosts = RetrofitClient.postApi.addPost(posts)
                Log.d(
                    "createQuote",
                    "Название -> ${addedPosts.name}\n " +
                            "Текст -> ${addedPosts.text}\n " +
                            "Теги -> ${addedPosts.tag}\n "
                )
            } catch (ex: Exception) {
                Log.e("createPost", ex.message.toString())
            }
        }
    }
}