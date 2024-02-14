package com.danilatyukov.exercisescalendar.ui.instructions

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.danilatyukov.exercisescalendar.R
import com.danilatyukov.exercisescalendar.ui.designUtills.shape20

/*val absRoundedCornerShape = AbsoluteRoundedCornerShape(
    topLeftPercent = 20,
    topRightPercent = 20,
    bottomLeftPercent = 0,
    bottomRightPercent = 0
)*/

@Composable
fun WarningAndContinue(onContinueClick: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier

            .padding(10.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.warning),
            contentDescription = null,
            modifier = Modifier.size(50.dp)
        )
        Text(text = stringResource(id = R.string.warning1))

        Button(
            onClick = onContinueClick,
            modifier = Modifier
                .fillMaxWidth(),
            shape = shape20,
            border = BorderStroke(1.dp, Color.White)
        ) {
            Text(
                text = stringResource(id = R.string.continueUpperCase),
                style = TextStyle(fontSize = 20.sp)
            )
        }
    }
}