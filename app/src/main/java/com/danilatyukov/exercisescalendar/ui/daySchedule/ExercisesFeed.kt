package com.danilatyukov.exercisescalendar.ui.daySchedule

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.danilatyukov.exercisescalendar.model.ExerciseItemModel


@Composable
fun ExercisesFeed(list: List<ExerciseItemModel>, ){
    LazyColumn(){
        items(items = list, key = {exercize -> exercize.id}){exerciceItemModel ->
            ExerciseItem(resId = exerciceItemModel.imgResId, name = exerciceItemModel.title, amount = exerciceItemModel.amount.toString())
        }
    }
}