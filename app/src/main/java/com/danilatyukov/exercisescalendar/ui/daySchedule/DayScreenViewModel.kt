package com.danilatyukov.exercisescalendar.ui.daySchedule

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.CreationExtras
import com.danilatyukov.exercisescalendar.Application
import com.danilatyukov.exercisescalendar.data.settings.SettingsRepository
import com.danilatyukov.exercisescalendar.domain.MakeDayScheduleUseCase
import com.danilatyukov.exercisescalendar.model.ExerciseItemModel


class DayScreenViewModel(
    private val settingsRepository: SettingsRepository,
    private val makeDayScheduleUseCase: MakeDayScheduleUseCase
) : ViewModel() {
    val selectedDay: Int
        get() = settingsRepository.selectedDay()

    val exercises: List<ExerciseItemModel>
        get() = makeDayScheduleUseCase.makeSelectedDaySchedule(settingsRepository.selectedDay())
}

//фабрика вьюмодели, которая передает ей зависимость, которая зависит от контекста
class DayScreenViewModelProvider() : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        val application = (extras[APPLICATION_KEY] as Application)

        return DayScreenViewModel(
            application.appContainer.settingsRepository,
            application.appContainer.makeDayScheduleUseCase
        ) as T
    }

}