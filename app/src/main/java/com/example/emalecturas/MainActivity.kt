package com.example.emalecturas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtLegajo.setSelection(0)
        txtLegajo.requestFocus()
        supportActionBar!!.hide()

        bLogin.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                enviarLegajo()

            }})

    }

    fun enviarLegajo(){
   // Toast.makeText(this,"Hola esto es un toast en kotlin", Toast.LENGTH_SHORT).show()
       intent = Intent(this, MostrarDatos::class.java)
        startActivity(intent)
        finish()

    }
}


