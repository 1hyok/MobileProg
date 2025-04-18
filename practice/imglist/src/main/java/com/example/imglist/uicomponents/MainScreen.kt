package com.example.imglist.uicomponents

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    ImageWithButton{
        ButtonWithEmoji()
    }
}