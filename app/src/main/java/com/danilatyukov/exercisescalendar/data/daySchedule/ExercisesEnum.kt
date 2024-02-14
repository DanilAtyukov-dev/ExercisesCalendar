package com.danilatyukov.exercisescalendar.data.daySchedule

import com.danilatyukov.exercisescalendar.R


enum class ExercisesEnum(val imgResId: Int, val title: String, val startQuantity: Int) {
    BTF(R.drawable.btf, "Body tilts forward", 5),
    ST(R.drawable.st,"Shoulder stretching", 5),
    PUSHUPS(R.drawable.pushups, "Push-Ups", 5),
    PRESS(R.drawable.press, "Press", 5),
    SQUATS(R.drawable.squats, "Squats", 5),
    STEPUPS(R.drawable.stepups, "Step-Ups", 5),
    PULLUPS(R.drawable.horbar, "Pull-Ups", 1);
}