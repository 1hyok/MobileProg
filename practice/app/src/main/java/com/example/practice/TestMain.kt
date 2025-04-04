package com.example.practice

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessAlarm
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage

@Preview
@Composable
private fun Fuck() {
    Button(
        onClick = {},
        content = {
            Row {
                Icon(Icons.Filled.AccessAlarm, contentDescription = null,
                    modifier = Modifier.size(ButtonDefaults.IconSize))
                Text("Fuck")
            }
        }
    )
}

@Preview
@Composable
fun SimpleImageLoading() {
    // 가장 기본적인 사용법
    AsyncImage(
        model = "https://alphabiz.iwinv.biz/news/data/20241213/p1065593059092330_187_thum.jpg",
        contentDescription = "샘플 이미지",
        modifier = Modifier.size(200.dp)
    )
}