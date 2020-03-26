package com.example.emalecturas.data.model

import java.io.Serializable

data class Post(
    var userId: String,
    var id: String,
    var title:String,
    var body:String): Serializable

