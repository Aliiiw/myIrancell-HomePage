package com.alirahimi.myirancell.ui.screens.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.alirahimi.myirancell.R

@Composable
fun HomeMiddleSection() {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        shape = RoundedCornerShape(20.dp),
    ) {

        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(start = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Image(
                painter = painterResource(id = R.drawable.wallet),
                contentDescription = "",
                modifier = Modifier.size(36.dp)
            )

            Spacer(modifier = Modifier.width(8.dp))
            Text(text = stringResource(id = R.string.runcell))
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "!", color = Color.Cyan)
        }
    }
}