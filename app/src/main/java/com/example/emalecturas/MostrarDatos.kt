package com.example.emalecturas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import com.example.emalecturas.R
import com.example.emalecturas.data.model.Post
import com.example.emalecturas.presentation.viewmodel.PostViewModel
import kotlinx.android.synthetic.main.activity_mostrar_datos.*
import org.koin.android.viewmodel.ext.android.getViewModel
import org.koin.android.viewmodel.ext.android.viewModel

class MostrarDatos : AppCompatActivity() {
    private val postViewModel:PostViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_datos)
        Log.d("valor", "valor")
        postViewModel.getPostViewModel()
        postViewModel.listOfPost.observe(this, Observer (function = fun(listPost : List<Post>?) {

        }))
 var trae:String =  postViewModel.listOfPost.value.toString()

        Log.d("boton", " Esto muestra en mostrarDatos $trae")

       // txtDatos.text = postViewModel.getPostViewModel().toString()
    }
}
