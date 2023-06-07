package com.alirahimi.myirancell.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.alirahimi.myirancell.R
import com.alirahimi.myirancell.ui.theme.FirstYellow


@Composable
fun HomeTabRowSection() {

    var selectedTab by remember {
        mutableStateOf(0)
    }

    val tabTitles = listOf(
        stringResource(id = R.string.hot),
        stringResource(id = R.string.gold),
        stringResource(id = R.string.money),
    )

    Column(modifier = Modifier.fillMaxSize().clip(RoundedCornerShape(16.dp))) {
        TabRow(
            selectedTabIndex = selectedTab,
            contentColor = FirstYellow,
            backgroundColor = Color.White,
            indicator = { line ->
                Box(
                    modifier = Modifier
                        .tabIndicatorOffset(line[selectedTab])
                        .height(6.dp)
                        .background(FirstYellow)
                )
            }
        ) {
            tabTitles.forEachIndexed { index, title ->
                Tab(
                    selected = (selectedTab == index),
                    onClick = { selectedTab = index },
                    selectedContentColor = Color.Black,
                    unselectedContentColor = Color.Gray,
                    text = {
                        Row {
                            Text(
                                text = title
                            )
                        }
                    }
                )
            }
        }

        if (selectedTab == 0){
            TabToShow()
        }
    }
}