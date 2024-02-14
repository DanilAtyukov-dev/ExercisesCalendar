package com.danilatyukov.exercisescalendar.ui.calendar

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.danilatyukov.exercisescalendar.model.DayItemModel


@Composable
fun DaysFeed(daysList: List<DayItemModel>, onClick:(DayItemModel) -> Unit, modifier: Modifier = Modifier){
    LazyColumn(modifier){
       items(
           items = daysList,
           key = {day -> day.id}
       ){day ->
            DayItem(dayNum = day.dayNum, complPercent = day.complPercent, onClick = {onClick(day)})
       }
    }
}