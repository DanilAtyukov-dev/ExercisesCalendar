package com.danilatyukov.exercisescalendar.ui.designUtills

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.danilatyukov.exercisescalendar.model.DifficultLevel

@Composable
fun MultiSwitch(
    options: List<DifficultLevel>,
    currentOption: Int,
    onOptionChange: (Int) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
    ) {
        options.forEach{level ->
            MultiSwitchItem(
                checked = currentOption == level.value,
                value = level,
                onCheckedChange = { onOptionChange(level.value) }
            )
        }
    }
}

@Composable
fun MultiSwitchItem(checked: Boolean, value: Enum<*>, onCheckedChange: () -> Unit) {
    ClickableText(
        text = AnnotatedString(text = value.name),
        onClick = {
            onCheckedChange()
        },
        style = TextStyle(textAlign = TextAlign.Center, color = Color.White),
        modifier = Modifier
            .clip(shape20)
            .border(
                if (checked) BorderStroke(1.dp, Color.White) else
                    BorderStroke(0.dp, Color.Transparent),
                shape = shape20
            )
            .background(
                if (checked) {
                    Color.Black
                } else Color.Transparent
            )
            .padding(10.dp)
    )
}