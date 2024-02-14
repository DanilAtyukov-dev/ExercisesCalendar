package com.danilatyukov.exercisescalendar.ui.daySchedule


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun DayScreen(
    onNavigateToCalendar: () -> Unit,
    modifier: Modifier = Modifier,
    vm: DayScreenViewModel = viewModel(factory = DayScreenViewModelProvider())
) {
    Column(modifier = modifier) {

        Row(
            Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(onClick = onNavigateToCalendar) {
                Icon(Icons.Filled.ArrowBack, contentDescription = null, tint = Color.White)
            }

            Text(text = "DAY - ${vm.selectedDay}", fontSize = 25.sp, fontWeight = FontWeight.Bold)
        }

        ExercisesFeed(list = vm.exercises)
    }

}

