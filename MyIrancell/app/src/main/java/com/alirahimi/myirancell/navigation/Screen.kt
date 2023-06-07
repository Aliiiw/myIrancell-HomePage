package com.alirahimi.myirancell.navigation

sealed class Screen(val route: String) {

    object Splash : Screen(route = "splash_screen")

    object Home : Screen(route = "home_screen")

    object Payment : Screen(route = "payment_screen")

    object Buy : Screen(route = "buy_screen")

    object Services : Screen(route = "services_screen")

    object More : Screen(route = "more_screen")
}
