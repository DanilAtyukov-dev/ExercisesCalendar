package com.danilatyukov.exercisescalendar.data.calendar

import com.danilatyukov.exercisescalendar.model.ExerciseItemModel


class DefaultExercisesDataSource() {
    fun fetchExercisesList(): List<ExerciseItemModel>{
        val list = mutableListOf<ExerciseItemModel>()
        ExercisesEnum.entries.forEach{
            list.add(it.toExerciseItemModel())
        }
        return list
    }
}



