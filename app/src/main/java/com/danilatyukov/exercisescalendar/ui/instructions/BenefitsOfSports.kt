package com.danilatyukov.exercisescalendar.ui.instructions

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.danilatyukov.exercisescalendar.R


@Composable
fun BenefitsOfSportsColumn() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
            .fillMaxSize()
            .padding(top = 10.dp)
    ) {
        Text(text = stringResource(id = R.string.benefitsTitle), fontSize = 15.sp)
        BenefitsOfSportsItem(resId = R.drawable.b1, text = stringResource(id =  R.string.benefit1))
        BenefitsOfSportsItem(resId = R.drawable.b2, text = stringResource(id =  R.string.benefit2))
        BenefitsOfSportsItem(resId = R.drawable.b3, text = stringResource(id =  R.string.benefit3))
    }
}

@Composable
fun BenefitsOfSportsItem(resId: Int, text: String) {
    Row(Modifier.padding(horizontal = 10.dp, vertical = 10.dp), verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = resId),
            contentDescription = null,
            modifier = Modifier
                .clip(CircleShape)
                .size(80.dp),
            contentScale = ContentScale.Crop
        )
        Text(text = text,
            modifier = Modifier.padding(start = 10.dp))
    }
}