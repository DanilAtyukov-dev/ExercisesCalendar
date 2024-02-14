package com.danilatyukov.exercisescalendar.data.exercise

import com.danilatyukov.exercisescalendar.model.ExerciseItemModel

class RemoteExercisesDataSource(/*apiClient: ApiClient*/) { //например Retrofit
    suspend fun fetchExercises(): List<ExerciseItemModel>{
        return mutableListOf(ExerciseItemModel(1, 1, "1", 1))
    }
}