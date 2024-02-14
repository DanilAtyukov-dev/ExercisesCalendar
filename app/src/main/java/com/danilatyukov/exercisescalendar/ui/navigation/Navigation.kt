package com.danilatyukov.exercisescalendar.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.danilatyukov.exercisescalendar.ui.theme.ExercisesCalendarTheme
import com.danilatyukov.exercisescalendar.model.Screens
import com.danilatyukov.exercisescalendar.ui.calendar.CalendarScreen
import com.danilatyukov.exercisescalendar.ui.daySchedule.DayScreen
import com.danilatyukov.exercisescalendar.ui.instructions.InstructionsScreen

@Composable
fun Navigation(
    vm: NavigationViewModel = viewModel(factory = NavigationViewModelProvider())
) {
    val startDestination = if (vm.isFirstStart) Screens.Instructions.route else Screens.Calendar.route
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = startDestination) {
        composable(Screens.Instructions.route) {
            vm.changeFirstStart()
            InstructionsScreen(onNavigateToCalendar = { navController.navigate(Screens.Calendar.route) })
        }
        composable(Screens.Calendar.route) {
            CalendarScreen(onNavigateToDay = { navController.navigate(Screens.Day.route) })
        }
        composable(Screens.Day.route) {
            DayScreen(onNavigateToCalendar = { navController.navigate(Screens.Calendar.route) })
        }
    }
}

@Preview(showBackground = true, heightDp = 1000)
@Composable
fun AppPreview() {
    ExercisesCalendarTheme {
        Navigation()
    }
}