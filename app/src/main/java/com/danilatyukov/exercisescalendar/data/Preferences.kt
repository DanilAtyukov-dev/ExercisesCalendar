package com.danilatyukov.exercisescalendar.data

import android.content.Context
import android.content.SharedPreferences

 class Preferences private constructor(){

    companion object{
        private var preferences: SharedPreferences? = null
        private lateinit var instance: Preferences

        fun create(context: Context): Preferences {
            if (preferences ==null){
                preferences = context.getSharedPreferences("prefs", 0)
                instance = Preferences()
                return instance
            }
            else return instance
        }
        fun getInstance(): Preferences {
            return instance
        }
    }

    fun difficult() = preferences!!.getInt("difficult", 1)
    fun changeDifficult(newValue: Int){
        preferences!!.edit().putInt("difficult", newValue).apply()
    }

    fun firstStart() = preferences!!.getBoolean("fs", true)
    fun changeFirstStart(boolean: Boolean){
        preferences!!.edit().putBoolean("fs", false).apply()
    }
}