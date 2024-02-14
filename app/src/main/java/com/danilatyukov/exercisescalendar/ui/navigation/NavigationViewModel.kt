package com.danilatyukov.exercisescalendar.ui.navigation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.CreationExtras
import com.danilatyukov.exercisescalendar.Application
import com.danilatyukov.exercisescalendar.data.settings.SettingsRepository


class NavigationViewModel(val settingsRepository: SettingsRepository): ViewModel(){
    val isFirstStart: Boolean
        get() = settingsRepository.firstStart()

    fun changeFirstStart() {
        settingsRepository.changeFirstStart(false)
    }
}

class NavigationViewModelProvider(): ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        val appContainer = (extras.get(APPLICATION_KEY) as Application).appContainer
        return NavigationViewModel(appContainer.settingsRepository) as T
    }
}
