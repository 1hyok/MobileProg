package com.example.practice

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Fuck(middleContent: @Composable () -> Unit) {
    Column {
        Button({}) { }
        middleContent()
        Button({}) { }
    }
}

@Preview
@Composable
private fun Suck() {
    BadgedBox({ Button({}) { Text("sdf") } }) {
        Text("JOT")
    }
}
