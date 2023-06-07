package com.alirahimi.myirancell.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.alirahimi.myirancell.R
import com.alirahimi.myirancell.ui.theme.FirstYellow
import com.alirahimi.myirancell.ui.theme.selectedBottomBar
import com.alirahimi.myirancell.ui.theme.unSelectedBottomBar

@Composable
fun BottomNavigationBar(
    navController: NavController,
    onItemClick: (BottomNavItem) -> Unit
) {


    val items = listOf(
        BottomNavItem(
            name = stringResource(id = R.string.home),
            route = Screen.Home.route,
            selectedIcon = painterResource(id = R.drawable.home_fill),
            deSelectedIcon = painterResource(id = R.drawable.home_outline)
        ),
        BottomNavItem(
            name = stringResource(id = R.string.payment),
            route = Screen.Payment.route,
            selectedIcon = painterResource(id = R.drawable.category_fill),
            deSelectedIcon = painterResource(id = R.drawable.category_outline)
        ),
        BottomNavItem(
            name = stringResource(id = R.string.buy),
            route = Screen.Buy.route,
            selectedIcon = painterResource(id = R.drawable.cart_fill),
            deSelectedIcon = painterResource(id = R.drawable.cart_outline)
        ),
        BottomNavItem(
            name = stringResource(id = R.string.service),
            route = Screen.Services.route,
            selectedIcon = painterResource(id = R.drawable.user_fill),
            deSelectedIcon = painterResource(id = R.drawable.user_outline)
        ),
        BottomNavItem(
            name = stringResource(id = R.string.more),
            route = Screen.More.route,
            selectedIcon = painterResource(id = R.drawable.user_fill),
            deSelectedIcon = painterResource(id = R.drawable.user_outline)
        )
    )

    val backStackEntry = navController.currentBackStackEntryAsState()
    val showBottomBar = backStackEntry.value?.destination?.route in items.map {
        it.route
    }

    if (showBottomBar) {
        BottomNavigation(
            modifier = Modifier.height(60.dp),
            elevation = 5.dp,
            backgroundColor = Color.White
        ) {

            items.forEachIndexed { index, item ->

                val selected = item.route == backStackEntry.value?.destination?.route

                BottomNavigationItem(
                    selected = selected,
                    onClick = { onItemClick(item) },
                    selectedContentColor = FirstYellow,
                    unselectedContentColor = MaterialTheme.colors.unSelectedBottomBar,
                    icon = {

                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            if (selected) {

                                Icon(
                                    modifier = Modifier.height(12.dp),
                                    painter = item.selectedIcon,
                                    contentDescription = item.name
                                )

                            } else {

                                Icon(
                                    modifier = Modifier.height(12.dp),
                                    painter = item.deSelectedIcon,
                                    contentDescription = item.name
                                )

                            }

                            Text(
                                text = item.name,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.padding(top = 5.dp),
                                fontSize = 12.sp
                            )
                        }
                    }
                )
            }
        }
    }

}