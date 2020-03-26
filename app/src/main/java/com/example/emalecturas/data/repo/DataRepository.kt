package com.example.emalecturas.data.repo

import com.example.emalecturas.data.JsonPlaceHolderApi
import com.example.emalecturas.data.model.Post
import retrofit2.Call
import retrofit2.Response
class DataRepository (var jsonPlaceHolderApi: JsonPlaceHolderApi) {


    fun getPostRepo (onPersonData : OnPersonData){
       jsonPlaceHolderApi.getPost().enqueue(object : retrofit2.Callback<List<Post>>{

            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                onPersonData.onSuccess(response.body() as List<Post>)

            }
            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                onPersonData.onFailure()
            }

    })

    }

    interface OnPersonData { //consulto para ver si se efectuo bien la funcion getPerson y devuelvo los parametros de post List
        fun onSuccess (data:List<Post>)
        fun onFailure()
    }

}