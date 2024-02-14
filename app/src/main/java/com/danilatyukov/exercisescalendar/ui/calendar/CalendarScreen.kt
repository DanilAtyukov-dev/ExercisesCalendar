package com.danilatyukov.exercisescalendar.ui.calendar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.danilatyukov.exercisescalendar.model.DifficultLevel
import com.danilatyukov.exercisescalendar.ui.designUtills.AppTitle
import com.danilatyukov.exercisescalendar.ui.designUtills.MultiSwitch
import com.danilatyukov.exercisescalendar.ui.theme.ExercisesCalendarTheme


@Composable
fun CalendarScreen(
    onNavigateToDay: () -> Unit,
    vm: CalendarViewModel = viewModel(factory = CalendarViewModelProvider())
) {

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        AppTitle()

        MultiSwitch(
            DifficultLevel.entries.toList(),
            currentOption = vm.difficult,
            onOptionChange = { newValue ->
                vm.difficultChange(newValue = newValue)
            },
        )

        DaysFeed(
            daysList = vm.days,
            onClick = { day ->
                vm.changeSelectedDay(day.id)
                onNavigateToDay()
            },
            modifier = Modifier.padding(10.dp)
        )
    }
}

@Preview
@Composable
fun CalendarScreenPreview() {
    ExercisesCalendarTheme {
        CalendarScreen({})
    }
}





