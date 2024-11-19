package com.example.shakeit.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.shakeit.ui.elements.HomePage
import com.example.shakeit.ui.elements.SetBackground
import com.example.shakeit.ui.elements.RegisterPage

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            SetBackground(navController = navController)
        }
        composable("home") {
            HomePage()
        }
        composable("register") {
            RegisterPage(navController = navController)
        }
    }
}
