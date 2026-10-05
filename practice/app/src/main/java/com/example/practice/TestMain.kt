package com.example.practice

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
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
    val jot = LocalContext.current.resources.getIdentifier(
        "baseline_vaping_rooms_24",
        "drawable",
        LocalContext.current.packageName
    )
    Image(
        painterResource(jot),
        contentDescription = "Shut Up"
    )
}