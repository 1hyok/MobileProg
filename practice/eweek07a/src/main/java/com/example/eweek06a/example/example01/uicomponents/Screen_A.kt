package com.example.eweek06a.example.example01.uicomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Screen_A(modifier: Modifier,onNavigateC:()->Unit,onNavigateD:()->Unit) {
    Column(modifier) {
        Text("Screen A")
        Button(
            {
                onNavigateC()
            }
        ) {
            Text("C")
        }
        Button(
            {
                onNavigateD()
            }
        ) {
            Text("D")
        }
    }
}