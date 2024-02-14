package com.danilatyukov.exercisescalendar.di

import android.content.Context
import com.danilatyukov.exercisescalendar.data.calendar.DefaultExercisesDataSource
import com.danilatyukov.exercisescalendar.data.calendar.CalendarRepository
import com.danilatyukov.exercisescalendar.data.settings.Preferences
import com.danilatyukov.exercisescalendar.data.settings.SettingsRepository
import com.danilatyukov.exercisescalendar.domain.MakeDayScheduleUseCase

class AppContainer(context: Context) {
    private val defaultExercisesDataSource = DefaultExercisesDataSource()
    val calendarRepository = CalendarRepository(defaultExercisesDataSource)

    private val preferences = Preferences(context)
    val settingsRepository = SettingsRepository(preferences)

    val makeDayScheduleUseCase  = MakeDayScheduleUseCase(settingsRepository, calendarRepository)
}