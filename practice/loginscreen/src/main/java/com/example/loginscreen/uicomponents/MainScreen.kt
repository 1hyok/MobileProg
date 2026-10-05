package com.example.loginscreen.uicomponents

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.loginscreen.navGraph.NaviGraph

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NaviGraph(navController=navController)
}