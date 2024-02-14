package com.danilatyukov.exercisescalendar.data.calendar

import com.danilatyukov.exercisescalendar.R
import com.danilatyukov.exercisescalendar.model.ExerciseItemModel

enum class ExercisesEnum(val imgResId: Int, val title: String, val startAmount: Int) {
    BTF(R.drawable.btf, "Body tilts forward", 5),
    ST(R.drawable.st,"Shoulder stretching", 5),
    PUSHUPS(R.drawable.pushups, "Push-Ups", 5),
    PRESS(R.drawable.press, "Press", 5),
    SQUATS(R.drawable.squats, "Squats", 5),
    STEPUPS(R.drawable.stepups, "Step-Ups", 5),
    PULLUPS(R.drawable.horbar, "Pull-Ups", 1);

    fun toExerciseItemModel(): ExerciseItemModel {
        return ExerciseItemModel(id = ordinal, imgResId = imgResId, title = title, amount = startAmount)
    }
}
