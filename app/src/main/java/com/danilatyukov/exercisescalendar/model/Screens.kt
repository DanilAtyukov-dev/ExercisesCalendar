package com.danilatyukov.exercisescalendar.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
sealed class Screens(val route: String) : Parcelable {
    object Instructions : Screens("instructions")
    object Calendar : Screens("calendar")
    object Day : Screens("day")
}
