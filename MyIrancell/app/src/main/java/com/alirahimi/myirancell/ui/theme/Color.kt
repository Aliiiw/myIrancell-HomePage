package com.alirahimi.myirancell.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xfff8b300)
val Purple700 = Color(0xfff8b300)
val Teal200 = Color(0xFF03DAC5)

val FirstYellow = Color(0xfff8b300)
val SecondYellow = Color(0xffffbe1a)

val Colors.selectedBottomBar: Color
    @Composable
    get() = if (isLight) Color(0xFF43474C) else Color(0xFFCFD4DA)

val Colors.unSelectedBottomBar: Color
    @Composable
    get() = if (isLight) Color(0xFFA4A1A1) else Color(0xFF575A5E)