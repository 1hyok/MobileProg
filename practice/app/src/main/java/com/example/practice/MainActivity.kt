package com.example.practice

import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
private fun Fuck(textState:String,onTextChange:(String)->Unit) {
    TextField(
        value = textState,
        onValueChange = onTextChange
    )
}

@Preview
@Composable
private fun Fuckfuck() {
    var textState by remember { mutableStateOf("") }
    Fuck(textState,{textState=it})
}