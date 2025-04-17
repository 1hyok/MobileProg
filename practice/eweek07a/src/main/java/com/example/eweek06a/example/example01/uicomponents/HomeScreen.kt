package com.example.eweek06a.example.example01.uicomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HomeScreen(modifier: Modifier,onNavigateA: () -> Unit, onNavigateB: () -> Unit) {
    Column(modifier) {
        Text("Fuck You")
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