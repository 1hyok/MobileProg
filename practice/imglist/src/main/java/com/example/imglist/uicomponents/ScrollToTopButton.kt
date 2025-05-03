package com.example.imglist.uicomponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ScrollToTopButton(
    modifier: Modifier = Modifier,
    goToTop:()->Unit
) {
    Box(
        Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomEnd,
    ) {

        FloatingActionButton(
            onClick = goToTop,
            modifier = Modifier.padding(10.dp)
        ) {
            Icon(
                Icons.Default.Home,
                contentDescription = ""
            )
        }
    }
}

@Preview
@Composable
fun ScrollToTopButtonPreview() {
    ScrollToTopButton{}
}