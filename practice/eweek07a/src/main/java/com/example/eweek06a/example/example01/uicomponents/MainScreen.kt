package com.example.eweek06a.example.example01.uicomponents

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.eweek06a.example.example01.navGraph.NavGraph

@SuppressLint("RestrictedApi")
@Composable
fun MainScreen() {
    val navController = rememberNavController()
    navController.addOnDestinationChangedListener {_,_,_ ->
        navController.currentBackStack.value.forEachIndexed {index, entry ->
            Log.d("backstack","$index ${entry.destination.route}")
        }
    }
    NavGraph(Modifier.fillMaxSize(),navController = navController)
}