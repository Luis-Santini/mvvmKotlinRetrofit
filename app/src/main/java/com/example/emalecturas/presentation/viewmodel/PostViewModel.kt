package com.example.emalecturas.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.emalecturas.data.JsonPlaceHolderApi
import com.example.emalecturas.data.model.Post
import com.example.emalecturas.data.repo.DataRepository
import org.koin.standalone.KoinComponent

class PostViewModel (val dataRepository: DataRepository): ViewModel(), KoinComponent {

    var listOfPost = MutableLiveData<List<Post>>()

    init {
        listOfPost.value = listOf()
    }

    fun getPostViewModel(){

        dataRepository.getPostRepo(object : DataRepository.OnPersonData {

            override fun onSuccess(data: List<Post>){
                listOfPost.value = data


            }

            override fun onFailure() {
                Log.d("boton", "Fallo")
            }
        })
    }

}