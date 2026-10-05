package com.example.eweek06a.example.example01.navGraph

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.eweek06a.example.example01.model.Routes
import com.example.eweek06a.example.example01.uicomponents.HomeScreen
import com.example.eweek06a.example.example01.uicomponents.Screen_A
import com.example.eweek06a.example.example01.uicomponents.Screen_B
import com.example.eweek06a.example.example01.uicomponents.Screen_C
import com.example.eweek06a.example.example01.uicomponents.Screen_D

@Composable
fun NavGraph(modifier: Modifier, navController: NavHostController) {
    NavHost(navController = navController, startDestination = Routes.Home.route) {
        composable(route = Routes.Home.route) {
            HomeScreen(
                modifier,
                onNavigateA = {
                    navController.navigate(Routes.ScreenA.route)
                }) {
                navController.navigate(Routes.ScreenB.route)
            }
        }
        composable(route = Routes.ScreenA.route) {
            Screen_A(
                modifier,
                onNavigateC ={ navController.navigate(Routes.ScreenC.route) }
            ) {
                navController.navigate(Routes.ScreenD.route)
            }
        }
        composable(route = Routes.ScreenB.route) {
            Screen_B(modifier)
        }
        composable(route = Routes.ScreenC.route) {
            Screen_C(modifier) { navController.navigate(Routes.Home.route) }
        }
        composable(route = Routes.ScreenD.route) {
            Screen_D(modifier)
        }
    }
}

@Preview
@Composable
private fun NavGraphPreview() {
    val navController = rememberNavController()
    NavGraph(Modifier.fillMaxSize(),navController = navController)
}