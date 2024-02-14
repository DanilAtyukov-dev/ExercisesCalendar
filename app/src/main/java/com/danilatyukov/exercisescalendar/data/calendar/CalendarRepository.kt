package com.danilatyukov.exercisescalendar.data.calendar

import com.danilatyukov.exercisescalendar.model.DayItemModel
import com.danilatyukov.exercisescalendar.model.ExerciseItemModel

class CalendarRepository(
    val defaultExercisesDataSource: DefaultExercisesDataSource
) {
    fun fetchExercisesList(): List<ExerciseItemModel> {
        return defaultExercisesDataSource.fetchExercisesList()
    }

    fun fetchDaysItemsList(numberDays: Int) = List(numberDays) { i ->
        DayItemModel(i + 1, "Day - ${i + 1}", "0%")
    }
}