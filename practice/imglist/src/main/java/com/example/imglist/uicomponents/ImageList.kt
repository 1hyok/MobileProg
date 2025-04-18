package com.example.imglist.uicomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.imglist.model.ButtonType
import com.example.imglist.model.ImageData
import com.example.imglist.model.ImageListFactory

@Composable
fun ImageList(
    modifier: Modifier = Modifier,
    imageList: MutableList<ImageData>
) {
    Column {

        imageList.forEachIndexed { index, imageData ->
            ImageWithButton(
                imageUri = imageData.imageUri
            ) {
                when (imageData.buttonType) {
                    ButtonType.EMOJI -> ButtonWithEmoji(
                        likes = imageData.likes,
                        dislikes = imageData.dislikes,
                        onClickLikes = {
                            imageList[index] = imageData.copy(likes = imageData.likes + 1)
                        }
                    ) {
                        imageList[index] = imageData.copy(dislikes = imageData.dislikes + 1)
                    }

                    ButtonType.BADGE -> ButtonWithBadge(
                        likes = imageData.likes
                    ) {
                        imageList[index] = imageData.copy(likes = imageData.likes + 1)
                    }

                    ButtonType.ICON -> ButtonWithIcon(
                        likes = imageData.likes
                    ) {
                        imageList[index] = imageData.copy(likes = imageData.likes + 1)
                    }

                    else -> throw IllegalArgumentException("타입 오류")
                }
            }
        }
    }
}

@Preview
@Composable
fun ImageListPreview() {
    ImageList(
        imageList = ImageListFactory.makeImageList()
    )
}