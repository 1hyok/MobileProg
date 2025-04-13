package com.example.eweek05a.uicomponents

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.eweek05a.model.ButtonType
import com.example.eweek05a.model.ImageData

@Composable
fun ImageList(
    modifier: Modifier = Modifier,
    imageList: MutableList<ImageData>
) {
    imageList.forEachIndexed { index, imageData ->
        when (imageData.buttonType) {
            ButtonType.BADGE -> {
                imageList[index] = imageData.copy(likes = imageData.likes + 1)
            }

            ButtonType.ICON -> {
                imageList[index] = imageData.copy(likes = imageData.likes + 1)
            }

            ButtonType.EMOJI -> {
                imageList[index] = imageData.copy(
                    likes = imageData.likes + 1,
                    dislikes = imageData.dislikes + 1
                )
            }
        }
    }
}