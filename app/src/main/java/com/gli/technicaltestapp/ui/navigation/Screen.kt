package com.gli.technicaltestapp.ui.navigation

sealed class Screen(val route: String) {
    data object Login : Screen("login")
    data object ListStudent : Screen("list_student")
    data object DetailStudent : Screen("detail_student")
    data object Onboarding : Screen("onboarding")
}