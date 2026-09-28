package com.example.newpr01.service

import com.example.newpr01.data.Posts
import retrofit2.http.Body
import retrofit2.http.POST

interface PostInterface {
    @POST("posts/add")
    suspend fun  addPost(@Body posts: Posts): Posts
}