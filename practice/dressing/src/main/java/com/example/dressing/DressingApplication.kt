package com.example.dressing

import android.app.Application
import com.google.firebase.FirebaseApp

class DressingApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)
    }
}