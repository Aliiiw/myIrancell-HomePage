package com.alirahimi.myirancell.ui.screens.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.alirahimi.myirancell.R
import com.alirahimi.myirancell.ui.theme.FirstYellow


@Composable
fun HomeStatusSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(top = 12.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                ItemInStatus(
                    text = stringResource(id = R.string.all),
                    price = "422,2040 ریال",
                    textButton = "پرداخت میان دوره",
                    itemCounts = 4
                )

                ItemInStatus(
                    text = stringResource(id = R.string.remain),
                    price = "65/850 ریال",
                    textButton = "مدیریت جیب جت",
                    itemCounts = 3
                )
            }

            Spacer(modifier = Modifier.height(4.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 16.dp),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                MiddleItem(image = painterResource(id = R.drawable.people))
                MiddleItem(image = painterResource(id = R.drawable.people))
                MiddleItem(image = painterResource(id = R.drawable.people))
                DrawCircle()
            }

            MakeTheArrows()

            MakeTheTitles()

            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(4.dp)
                    .alpha(0.5f), color = Color.LightGray
            )

            HomeMiddleSection()

            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(4.dp)
                    .alpha(0.5f), color = Color.LightGray
            )

            HomeTabRowSection()
        }
    }
}

@Composable
fun MakeTheTitles() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        TitleItem(text = "خرید بسته چند کاربره")
        TitleItem(text = "خرید بسته پیشنهادی")
        TitleItem(text = "خرید بسته مکالمه")
        TitleItem(text = "خرید بسته اینترنت")
    }
}

@Composable
fun TitleItem(
    text: String
) {
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier.wrapContentSize(),
        colors =
        ButtonDefaults.buttonColors(
            backgroundColor = FirstYellow
        )
    ) {
        Text(text = text, fontSize = 7.sp)
    }
}

@Composable
fun MakeTheArrows() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Filled.ArrowForward,
            contentDescription = "",
            modifier = Modifier.size(18.dp)
        )
        Icon(
            imageVector = Icons.Filled.ArrowBack,
            contentDescription = "",
            modifier = Modifier.size(18.dp)
        )
    }
}

@Composable
fun ItemInStatus(
    text: String,
    price: String,
    textButton: String,
    icon: ImageVector = Icons.Default.ArrowDropDown,
    itemCounts: Int
) {
    Surface(
        modifier = Modifier
            .width(180.dp)
            .height(120.dp),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(1.dp, Color.Black.copy(alpha = 0.5f))
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = text, color = Color.LightGray)

            Text(text = price)

            if (itemCounts == 4) {
                Row(
                    Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {

                    Button(
                        onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                            backgroundColor = FirstYellow
                        )

                    ) {
                        Text(text = textButton)
                    }
                    Spacer(modifier = Modifier.width(8.dp))

                    Icon(imageVector = icon, contentDescription = "")
                }
            } else {
                Button(
                    onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Cyan
                    )

                ) {
                    Text(text = textButton)
                }
            }

        }
    }

}


@Composable
fun MiddleItem(
    image: Painter
) {

    Image(
        modifier = Modifier
            .clip(CircleShape)
            .size(54.dp)
            .background(FirstYellow),
        painter = image,
        contentDescription = ""
    )

}

@Composable
fun DrawCircle() {

    Box(
        modifier = Modifier
            .clip(CircleShape)
            .size(54.dp), contentAlignment = Alignment.Center
    ) {
        Text(text = " ۲۵ مگ ")
        CircularChart()
    }
}

@Composable
fun CircularChart(
    value: Float = 55f,
    color: Color = Color(0xFF11BE73),
    backgroundCircleColor: Color = Color.LightGray.copy(alpha = 0.2f),
    size: Dp = 54.dp,
    thickness: Dp = 4.dp,
    gapBetweenCircles: Dp = 1.dp
) {

    val sweepAngles = 360 * value / 100

    Canvas(
        modifier = Modifier.size(size)
    ) {

        var arcRadius = size.toPx()



        arcRadius -= gapBetweenCircles.toPx()

        drawCircle(
            color = backgroundCircleColor,
            radius = arcRadius / 2,
            style = Stroke(width = thickness.toPx(), cap = StrokeCap.Butt)
        )

        drawArc(
            color = color,
            startAngle = -90f,
            sweepAngle = sweepAngles.toFloat(),
            useCenter = false,
            style = Stroke(width = thickness.toPx(), cap = StrokeCap.Round),
            size = Size(arcRadius, arcRadius),
            topLeft = Offset(
                x = (size.toPx() - arcRadius) / 2, y = (size.toPx() - arcRadius) / 2
            )
        )
    }

    Spacer(modifier = Modifier.height(32.dp))

}