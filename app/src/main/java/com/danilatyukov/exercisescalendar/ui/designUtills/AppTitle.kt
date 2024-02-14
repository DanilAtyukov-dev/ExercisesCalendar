package com.danilatyukov.exercisescalendar.ui.designUtills

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.danilatyukov.exercisescalendar.R

@Composable
fun AppTitle(modifier: Modifier = Modifier){
    Image(
        painter = painterResource(id = R.drawable.appname),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 30.dp, start = 50.dp, end = 50.dp)
    )
}