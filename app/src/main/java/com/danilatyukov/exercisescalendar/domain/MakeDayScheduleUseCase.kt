package com.danilatyukov.exercisescalendar.domain

import com.danilatyukov.exercisescalendar.data.calendar.CalendarRepository
import com.danilatyukov.exercisescalendar.data.settings.SettingsRepository
import com.danilatyukov.exercisescalendar.model.ExerciseItemModel

class MakeDayScheduleUseCase(
    private val settingsRepository: SettingsRepository,
    private val calendarRepository: CalendarRepository
) {

    fun makeSelectedDaySchedule(day: Int): List<ExerciseItemModel> {
        val result = mutableListOf<ExerciseItemModel>()
        calendarRepository.fetchExercisesList().forEach { it ->
            val exercise = ExerciseItemModel(
                id = it.id,
                imgResId = it.imgResId,
                title = it.title,
                amount = it.amount * day * settingsRepository.difficult() / 2
            )
            result.add(exercise)
        }
        return result
    }


}