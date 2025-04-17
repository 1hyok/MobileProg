package com.example.eweek06a.example.example01.uicomponents

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.week06.example01.navGraph.NavGraph

@SuppressLint("RestrictedApi")
@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    // 백 스택 추적 코드
    navController.addOnDestinationChangedListener { _, _, _
        ->
        navController.currentBackStack.value.forEachIndexed { index, navBackStackEntry ->
            Log.d("BackStack"
                ,
                "$index ${navBackStackEntry.destination.route}")
        }
    }
//    navController.addOnDestinationChangedListener { _, destination, _ ->
//        Log.d("BackStack", "현재 경로: ${destination.route}")
//    }

    NavGraph(navController = navController)
}