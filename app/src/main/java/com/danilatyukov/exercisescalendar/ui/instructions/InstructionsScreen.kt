package com.danilatyukov.exercisescalendar.ui.instructions

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.danilatyukov.exercisescalendar.R
import com.danilatyukov.exercisescalendar.ui.theme.ExercisesCalendarTheme
import com.danilatyukov.exercisescalendar.ui.designUtills.AboutFeature
import com.danilatyukov.exercisescalendar.ui.designUtills.AppTitle



@Composable
fun InstructionsScreen(onNavigateToCalendar:() -> Unit, modifier: Modifier = Modifier) {
    Column(

        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        ) {
        AppTitle()

        AboutFeature(
           title = stringResource(id = R.string.aboutAppTitle),
           text = stringResource(id = R.string.aboutApp1))

        BenefitsOfSportsColumn()

        WarningAndContinue(onContinueClick = onNavigateToCalendar)
    }
}

@Preview(showBackground = false)
@Composable
fun InstructionsScreenPreview(){

    ExercisesCalendarTheme {
        Surface {
            InstructionsScreen(onNavigateToCalendar = { /*TODO*/ })
        }
    }
}



