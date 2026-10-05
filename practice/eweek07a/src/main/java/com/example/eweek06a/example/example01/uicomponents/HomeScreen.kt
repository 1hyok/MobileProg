package com.example.eweek06a.example.example01.uicomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(modifier: Modifier,onNavigateA: () -> Unit, onNavigateB: () -> Unit) {
    Column(
        modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ) {
        Text("Home", fontSize = 40.sp, fontWeight = FontWeight.ExtraBold)
        Button(
            onClick = onNavigateA,
        ) {
            Text("A")
        }
        Button(
            onClick = onNavigateB,
        ) {
            Text("B")
        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
}