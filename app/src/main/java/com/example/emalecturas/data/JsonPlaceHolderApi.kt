package com.example.emalecturas.data

import com.example.emalecturas.data.model.Post
import retrofit2.Call
import retrofit2.http.GET

interface JsonPlaceHolderApi {
@GET("/posts")
fun getPost():Call<List<Post>>
}