package com.danilatyukov.exercisescalendar.data.settings

import android.content.Context

class Preferences(context: Context) {
    private val appContext = context.applicationContext //разница между context и appContext
    private val preferences
        get() = appContext.getSharedPreferences("prefs", 0)


    fun difficult() = preferences!!.getInt("difficult", 1)
    fun changeDifficult(newValue: Int) {
        preferences!!.edit().putInt("difficult", newValue).apply()

    }

    fun firstStart() = preferences!!.getBoolean("fs", true)
    fun changeFirstStart(boolean: Boolean) {
        preferences!!.edit().putBoolean("fs", boolean).apply()
    }

    fun selectedDay() = preferences!!.getInt("selectedDay", 1)
    fun changeSelectedDay(newValue: Int) {
        preferences!!.edit().putInt("selectedDay", newValue).apply()
    }

}