package com.example.imglist.uicomponents

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonWithBadge(
    modifier: Modifier = Modifier,
    likes:Int,
    onClick:()->Unit
) {

    Column(Modifier.padding(8.dp)) {
        BadgedBox(
            {
                Badge {
                    Text("$likes")
                }
//                Text("Fuck")
            }
        ) {
            Icon(
                Icons.Default.Favorite,
                contentDescription = "Heart",
                modifier = Modifier.clickable(onClick=onClick)
                ,
                tint = if (likes > 0) Color.Red
                else
                    LocalContentColor.current
            )
        }
    }
}

@Preview
@Composable
private fun ButtonWithBadgePrevew() {
    var likes by remember { mutableIntStateOf(0) }
    ButtonWithBadge(likes = likes){
            likes++
    }
}