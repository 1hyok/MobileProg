package com.example.eweek06a.example.example01.uicomponents

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.eweek06a.example.example01.navGraph.NavGraph

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    NavGraph(Modifier.fillMaxSize(),navController = navController)
}