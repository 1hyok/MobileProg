package com.example.loginscreen.navGraph

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.loginscreen.model.Routes
import com.example.loginscreen.uicomponents.LoginScreen
import com.example.loginscreen.uicomponents.RegisterScreen
import com.example.loginscreen.uicomponents.WelcomeScreen

@Composable
fun NaviGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = Routes.Login.route) {
        composable(Routes.Login.route) {
            LoginScreen(
                onWelcomeNavigate = { id ->
                    navController.navigate(
                        Routes.Welcome.route +
                                if (id.isEmpty())
                                    ""
                                else
                                    "/$id"
                    )
                },
                onRegisterNavigate =
                    { userId, passwd ->
                        navController.navigate(
                            Routes.Register.route +
                                    if (userId.isEmpty() && passwd.isEmpty())
                                        ""
                                    else
                                        "?userId={$userId}&passwd={$passwd}"
                        )
                    }
            )
        }

        composable(
            Routes.Register.route + "?userId={userId}&passwd={passwd}",
            arguments = listOf(
                navArgument("userId") {
                    type = NavType.StringType
                    defaultValue = "User"
                },
                navArgument("passwd") {
                    type = NavType.StringType
                    defaultValue = "12345678"
                }
            )
        ) {
            RegisterScreen(
                id = it.arguments?.getString("userId"),
                passwd = it.arguments?.getString("passwd")
            )
        }
        composable(
            Routes.Welcome.route + "/{userId}",
            arguments = listOf(
                navArgument("userId") {
                    type = NavType.StringType
                }
            )
        ) {
            WelcomeScreen(
                id = "${it.arguments?.getString("userId")}"
            )
        }
    }
}