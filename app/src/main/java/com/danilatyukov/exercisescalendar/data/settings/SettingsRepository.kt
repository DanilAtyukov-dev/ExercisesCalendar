package com.danilatyukov.exercisescalendar.data.settings

import com.danilatyukov.exercisescalendar.data.settings.Preferences


class SettingsRepository(
    val preferences: Preferences
) {
    fun difficult() = preferences.difficult()
    fun changeDifficult(newValue: Int){
        preferences.changeDifficult(newValue)
    }

    fun selectedDay() = preferences.selectedDay()
    fun changeSelectedDay(newValue: Int){
        preferences.changeSelectedDay(newValue)
    }

    fun firstStart() = preferences.firstStart()
    fun changeFirstStart(boolean: Boolean){
        preferences.changeFirstStart(boolean)
    }
}