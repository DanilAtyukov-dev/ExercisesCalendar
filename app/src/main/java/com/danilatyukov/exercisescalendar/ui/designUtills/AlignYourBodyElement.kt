package com.danilatyukov.exercisescalendar.ui.designUtills

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.danilatyukov.exercisescalendar.ui.theme.ExercisesCalendarTheme


@Composable
fun AlignYourBodyElement(text: String, resId: Int, onClickEvent:() -> Unit, modifier: Modifier = Modifier){
    Column(modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(

            painter = painterResource(id = resId),
            contentDescription = null,
            modifier = Modifier
                .size(90.dp)
                .clip(CircleShape)
                .clickable { onClickEvent() },
            contentScale = ContentScale.FillBounds
        )
        Text(text = text)
    }
}

@Preview
@Composable
fun AlignYourBodyElementPreview(){
    ExercisesCalendarTheme {

    }
}