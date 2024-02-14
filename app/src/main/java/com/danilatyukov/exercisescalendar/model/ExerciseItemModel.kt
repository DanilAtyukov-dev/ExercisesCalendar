package com.danilatyukov.exercisescalendar.model

import androidx.compose.runtime.Composable

data class ExerciseItemModel(
    val id: Int,
    val imgResId: Int,
    val title: String,
    val amount: Int
)