package com.example.emalecturas
import com.example.emalecturas.data.repo.DataRepository
import com.example.emalecturas.data.JsonPlaceHolderApi
import com.example.emalecturas.presentation.viewmodel.PostViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

val mainModule = module {

    single { DataRepository(get()) }

    single { createWebService() }

    viewModel { PostViewModel(get()) }

}

fun createWebService(): JsonPlaceHolderApi {
    val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
       .addCallAdapterFactory(RxJava2CallAdapterFactory.create())

        .baseUrl("https://jsonplaceholder.typicode.com")
        .build()

    return retrofit.create(JsonPlaceHolderApi::class.java)
}