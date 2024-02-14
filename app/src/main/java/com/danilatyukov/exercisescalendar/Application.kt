package com.danilatyukov.exercisescalendar

import android.app.Application
import com.danilatyukov.exercisescalendar.di.AppContainer


class Application : Application() {
    lateinit var appContainer: AppContainer


    override fun onCreate() {
        super.onCreate()
        appContainer = AppContainer(applicationContext)
    }
}