package com.alirahimi.myirancell.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.alirahimi.myirancell.ui.theme.FirstYellow
import com.alirahimi.myirancell.ui.theme.SecondYellow

@Composable
fun HomeScreen(navController: NavHostController) {
    Home(navController)
}

@Composable
fun Home(navController: NavHostController) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(FirstYellow)
            .padding(top = 12.dp)
    ) {

        item { HomeTopBarSection() }
        item { HomeStatusSection() }
    }

}
