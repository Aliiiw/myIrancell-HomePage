package com.alirahimi.myirancell.ui.screens

import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.alirahimi.myirancell.R
import com.alirahimi.myirancell.navigation.Screen
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavHostController) {

    Splash()

    LaunchedEffect(true) {
        delay(2500)
        navController.navigate(Screen.Home.route) {
            popUpTo(Screen.Splash.route) {
                inclusive = true
            }
        }
    }
}

@Composable
fun Splash() {
    Box(
        modifier = Modifier
            .background(Color(0xFFCC9900))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        InfiniteAnimation()
    }
}

@Composable
fun InfiniteAnimation() {

    val infiniteTransition = rememberInfiniteTransition()

    val size by infiniteTransition.animateFloat(
        initialValue = 150f,
        targetValue = 220f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 800,
                delayMillis = 100
            ),
            repeatMode = RepeatMode.Reverse
        )
    )
    Image(
        modifier = Modifier.size(size.dp),
        painter = painterResource(id = R.drawable.myirancell),
        contentDescription = null
    )
}