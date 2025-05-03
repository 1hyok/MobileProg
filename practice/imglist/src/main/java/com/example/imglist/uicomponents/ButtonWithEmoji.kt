package com.example.imglist.uicomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun ButtonWithEmoji(
    likes:Int,
    dislikes:Int,
    onClickLikes:()->Unit,
    onClickDislikes:()->Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        IconButton(onClickLikes) {
            Text("😍", fontSize = 32.sp)
        }
        Text("$likes")
        IconButton(onClickDislikes) {
            Text("🥵", fontSize = 32.sp)
        }
        Text("$dislikes")
    }
}
@Preview
@Composable
private fun ButtonWithEmojiPreview() {
}