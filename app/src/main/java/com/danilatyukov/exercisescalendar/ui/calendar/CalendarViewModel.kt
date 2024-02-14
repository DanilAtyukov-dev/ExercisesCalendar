package com.danilatyukov.exercisescalendar.ui.calendar

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.CreationExtras
import com.danilatyukov.exercisescalendar.Application
import com.danilatyukov.exercisescalendar.data.calendar.CalendarRepository
import com.danilatyukov.exercisescalendar.data.settings.SettingsRepository
import com.danilatyukov.exercisescalendar.model.DayItemModel


class CalendarViewModel(val settingsRepository: SettingsRepository, val calendarRepository: CalendarRepository) : ViewModel() {

    private val _days = calendarRepository.fetchDaysItemsList(30).toMutableStateList()
    private var _difficult: Int by mutableIntStateOf(settingsRepository.difficult())

    val days: List<DayItemModel>
        get() = _days

    val difficult: Int
        get() = _difficult

    fun difficultChange(newValue: Int) {
        settingsRepository.changeDifficult(newValue)
        _difficult = newValue
    }


    fun changeSelectedDay(newValue: Int) {
        settingsRepository.changeSelectedDay(newValue)
    }

}

/*private fun getDays() = List(30) { i ->
    DayItemModel(i + 1, "Day - ${i + 1}", "0%")
}*/

class CalendarViewModelProvider() : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        val application = (extras[APPLICATION_KEY] as Application)

        return CalendarViewModel(application.appContainer.settingsRepository, application.appContainer.calendarRepository) as T
    }

}