package com.gli.technicaltestapp.ui.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.gli.technicaltestapp.ui.navigation.Screen
import com.gli.technicaltestapp.ui.presentation.login.LoginScreen
import com.gli.technicaltestapp.ui.presentation.onboarding.OnboardingScreen
import com.gli.technicaltestapp.ui.presentation.student.DetailStudentScreen
import com.gli.technicaltestapp.ui.presentation.student.StudentScreen

@Composable
fun TechnicalTestApp(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    Scaffold() { contentPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Onboarding.route,
            modifier = modifier.padding(contentPadding)
        ) {
            composable(Screen.ListStudent.route) {
                StudentScreen(navController = navController)
            }
            composable(Screen.Login.route) {
                LoginScreen(navController = navController)
            }
            composable(Screen.Onboarding.route) {
                OnboardingScreen(navController = navController)
            }
            composable(
                Screen.DetailStudent.route + "/{id}",
                arguments = listOf(navArgument("id") { type = NavType.IntType })
            ) { navBackStackEntry ->
                DetailStudentScreen(
                    navController = navController,
                    id = navBackStackEntry.arguments?.getInt("id")
                )
            }
        }
    }
}