package com.alirahimi.myirancell.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alirahimi.myirancell.R

@Composable
fun TabToShow() {
    Column(modifier = Modifier.fillMaxSize().padding(bottom = 24.dp, top = 10.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 4.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            ItemInTab(image = painterResource(id = R.drawable.snapptaxi), text = "اسنپ")
            ItemInTab(image = painterResource(id = R.drawable.snappfood), text = "اسنپ فود")
            ItemInTab(image = painterResource(id = R.drawable.jajiga), text = "جاجیگا")
            ItemInTab(image = painterResource(id = R.drawable.rahayamkon), text = "صداتو")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            ItemInTab(image = painterResource(id = R.drawable.runcell), text = "رانسل")
            ItemInTab(image = painterResource(id = R.drawable.jabama1679306217519), text = "جاباما")
            ItemInTab(image = painterResource(id = R.drawable.kharidkhodrodarborce), text = "سرمایه گذاری")
            ItemInTab(image = painterResource(id = R.drawable.baman1686051351686), text = "بلیط مترو")
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            ItemInTab(image = painterResource(id = R.drawable.azki), text = "وام آسان")
            ItemInTab(image = painterResource(id = R.drawable.toranj), text = "ترنج")
            ItemInTab(image = painterResource(id = R.drawable.khanoomipng), text = "خانومی")
            ItemInTab(image = painterResource(id = R.drawable.mofid), text = "مفید")
        }
    }
}


@Composable
fun ItemInTab(
    image: Painter,
    text: String
) {
    Column(
        modifier = Modifier
            .width(60.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(12.dp))
        ) {
            Image(
                modifier = Modifier.size(42.dp),
                painter = image,
                contentDescription = null
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = text,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 13.sp,
        )
    }
}