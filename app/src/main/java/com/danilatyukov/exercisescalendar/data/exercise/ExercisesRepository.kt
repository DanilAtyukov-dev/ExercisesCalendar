package com.danilatyukov.exercisescalendar.data.exercise

import android.util.Log
import com.danilatyukov.exercisescalendar.model.ExerciseItemModel
import java.lang.Exception

class ExercisesRepository(
    val localExercisesDataSource: LocalExercisesDataSource,
    val remoteExercisesDataSource: RemoteExercisesDataSource
){
    suspend fun fetchExercises(): List<ExerciseItemModel>{
        try {
            val exercises = remoteExercisesDataSource.fetchExercises()//получить свежие новости
            localExercisesDataSource.updateExercises(exercises = exercises)
        } catch (exception: Exception /*RemoteDataSourceNotAvailableException*/){
            Log.d ( "NewsRepository", "Connection failed, using local data source")
        }

        return localExercisesDataSource.fetchExercises() // база данных - источник истины
    }
}