package com.example.dressing.uicomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.dressing.R

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val clothes = listOf("arms", "eyebrows", "glasses", "eyes", "hat", "mouth", "mustache", "nose", "shoes")
    Column(Modifier.fillMaxSize()) {
        Image(
            ImageBitmap.imageResource(R.drawable.body),
            contentDescription = null
        )
        Column {
            for(i in 0 until 5) {
                Row {
                    Checkbox(
                        checked = true,
                        onCheckedChange = {}
                    )
                    Text(clothes[2*i])
                    Checkbox(
                        checked = true,
                        onCheckedChange = {}
                    )
                    Text(clothes[2*i+1])
                }
            }
        }
    }
}

@Composable
fun Text(x0: String) {
    TODO("Not yet implemented")
}

@Preview
@Composable
private fun MainScreenPreview() {
    MainScreen()
}