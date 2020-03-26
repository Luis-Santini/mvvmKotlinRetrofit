package com.example.emalecturas

import android.app.Application
import org.koin.android.ext.android.startKoin

class MyKoin :Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin(this, listOf(mainModule),loadPropertiesFromFile = true)
    }
}