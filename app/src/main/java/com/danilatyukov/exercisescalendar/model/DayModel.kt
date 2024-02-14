package com.danilatyukov.exercisescalendar.model

import com.danilatyukov.exercisescalendar.model.ExerciseItemModel

data class DayModel(
    val dayNum: Int,
    val complPercent: Int,
    val exercises: List<ExerciseItemModel>
)
