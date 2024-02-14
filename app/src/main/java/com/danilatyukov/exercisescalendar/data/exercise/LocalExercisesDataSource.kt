package com.danilatyukov.exercisescalendar.data.exercise

import com.danilatyukov.exercisescalendar.model.ExerciseItemModel

class LocalExercisesDataSource(/*exercises: ExercisesDao*/) { //DAO - DataAccessObject
    suspend fun fetchExercises(): List<ExerciseItemModel>{
        return mutableListOf(ExerciseItemModel(1, 1, "1", 1))
    }

    suspend fun updateExercises(exercises: List<ExerciseItemModel>){
        //exercisesDao.save(exercises)
    }
}