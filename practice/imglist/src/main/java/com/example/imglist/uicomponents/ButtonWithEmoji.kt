package com.example.imglist.uicomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun ButtonWithEmoji() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        var likes by remember { mutableStateOf(0) };
        var dislikes by remember { mutableStateOf(0) };
        IconButton(
            {
                likes++
            },
        ) {
            Text("😍", fontSize = 32.sp)
        }
        Text("$likes")
        IconButton(
            {
                dislikes++
            },
        ) {
            Text("🥵", fontSize = 32.sp)
        }
        Text("$dislikes")
    }
}
@Preview
@Composable
private fun ButtonWithEmojiPreview() {
    ButtonWithEmoji()
}