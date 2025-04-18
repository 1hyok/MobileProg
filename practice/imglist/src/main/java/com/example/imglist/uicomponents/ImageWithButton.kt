package com.example.imglist.uicomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.imglist.model.ImageUri

@Composable
fun ImageWithButton(
    imageUri: ImageUri,
    modifier: Modifier = Modifier,
    button: @Composable () -> Unit
) {
    val img = when(imageUri){
        is ImageUri.ResImage ->  imageUri.resId
        is ImageUri.WebImage -> imageUri.webId
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AsyncImage(
            model = img,
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        button()
    }
}

@Preview
@Composable
private fun ButtonWithImagePreview() {
}