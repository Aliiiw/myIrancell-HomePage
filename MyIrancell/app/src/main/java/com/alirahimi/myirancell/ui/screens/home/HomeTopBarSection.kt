package com.alirahimi.myirancell.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alirahimi.myirancell.R
import com.alirahimi.myirancell.ui.theme.FirstYellow
import com.alirahimi.myirancell.ui.theme.SecondYellow

@Composable
fun HomeTopBarSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(start = 8.dp, end = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        TopBarCardInfo(name = "Aliiiw", phoneNumber = "09171234567")

        //Spacer(modifier = Modifier.width(72.dp))

        TopBarCardNotification()
    }
}

@Composable
fun TopBarCardInfo(
    name: String,
    phoneNumber: String,
    painter: Painter = painterResource(id = R.drawable.mtni_black_fa)
) {
    Card(
        modifier = Modifier.wrapContentWidth(),
        shape = RoundedCornerShape(8.dp),
        backgroundColor = SecondYellow

    ) {
        Row(
            modifier = Modifier
                .width(230.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painter,
                contentDescription = "",
                modifier = Modifier
                    .size(60.dp)
                    .padding(horizontal = 8.dp)
            )

            Column(modifier = Modifier.wrapContentHeight()) {
                Text(text = name)
                Text(text = phoneNumber)
            }

            Spacer(modifier = Modifier.width(24.dp))

            Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = "")
        }

    }
}

@Composable
fun TopBarCardNotification() {

    Card(
        modifier = Modifier.size(48.dp),
        shape = RoundedCornerShape(8.dp),
        backgroundColor = SecondYellow
    ) {

        Icon(
            imageVector = Icons.Default.Notifications,
            contentDescription = "",
            modifier = Modifier.size(48.dp)
        )

        Box(modifier = Modifier.fillMaxSize(), Alignment.TopEnd) {
            Box(modifier = Modifier.clip(CircleShape), contentAlignment = Alignment.TopEnd) {
                Card(backgroundColor = Color.Red) {
                    Text(text = "18", fontSize = 10.sp)
                }
            }
        }
    }

}