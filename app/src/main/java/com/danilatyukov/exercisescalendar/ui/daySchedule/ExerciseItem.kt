package com.danilatyukov.exercisescalendar.ui.daySchedule

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.danilatyukov.exercisescalendar.ui.designUtills.shape20

@Composable
fun ExerciseItem(resId: Int, name: String, amount: String, modifier: Modifier = Modifier) {
    Row(Modifier.padding(10.dp)) {
        Image(
            painter = painterResource(id = resId),
            contentDescription = null,
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Column(Modifier.padding(start = 50.dp)) {
            Text(text = name)
            Text(text = amount, modifier.clip(shape = shape20).background(MaterialTheme.colorScheme.primary).padding(5.dp))
        }
    }
}