package com.oktaygenc.bootcampnavigationhomework

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.oktaygenc.bootcampnavigationhomework.ui.screens.HomeScreen
import com.oktaygenc.bootcampnavigationhomework.ui.screens.PageAScreen
import com.oktaygenc.bootcampnavigationhomework.ui.screens.PageBScreen
import com.oktaygenc.bootcampnavigationhomework.ui.screens.PageXScreen
import com.oktaygenc.bootcampnavigationhomework.ui.screens.PageYScreen

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("pageA") { PageAScreen(navController) }
        composable("pageB") { PageBScreen(navController) }
        composable("pageX") { PageXScreen(navController) }
        composable("pageY") { PageYScreen(navController) }
    }
}

@Composable
fun MyApp() {
    val navController = rememberNavController()
    AppNavHost(navController)
}
