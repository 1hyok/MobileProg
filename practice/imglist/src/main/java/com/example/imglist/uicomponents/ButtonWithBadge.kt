package com.example.imglist.uicomponents

import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ButtonWithBadge(modifier: Modifier = Modifier) {
    BadgedBox() { }
}

@Preview
@Composable
private fun ButtonWithBadge() {
    ButtonWithBadge()
}