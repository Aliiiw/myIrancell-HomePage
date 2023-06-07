package com.alirahimi.myirancell.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.alirahimi.myirancell.ui.screens.*
import com.alirahimi.myirancell.ui.screens.home.HomeScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)
        }

        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }

        composable(route = Screen.Buy.route) {
            BuyScreen(navController = navController)
        }

        composable(route = Screen.Services.route) {
            ServicesScreen(navController = navController)
        }

        composable(route = Screen.More.route) {
            MoreScreen(navController = navController)
        }

        composable(route = Screen.Payment.route) {
            PaymentScreen(navController = navController)
        }
    }
}