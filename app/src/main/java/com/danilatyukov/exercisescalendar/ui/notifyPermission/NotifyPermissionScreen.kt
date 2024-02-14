package com.danilatyukov.exercisescalendar.ui.notifyPermission

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.danilatyukov.exercisescalendar.ui.designUtills.AboutFeature


@Preview(showBackground = true)
@Composable
fun NotifyPermissionScreen(){
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        AboutFeature("Включить уведомления", "Чтобы получать уведомления надо разрешить уведомления")
        AllowOrLater()
    }
}

@Composable
fun AllowOrLater(modifier: Modifier = Modifier.fillMaxWidth().padding(10.dp)){
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = {}, modifier = modifier) {
            Text(text = "Allow")
        }

        ClickableText(text = AnnotatedString("maybe later"), onClick = {})
    }
}