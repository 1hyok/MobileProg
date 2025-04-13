package com.example.eweek05a.model

import androidx.compose.runtime.saveable.listSaver

data class ImageData(
    val image: ImageUri,
    val buttonType: ButtonType,
    val likes: Int = 0,
    val dislikes: Int = 0
) {
    companion object {
        val imageSaver = listSaver<ImageData, Any>(
            save = {
                val img = when(it.image){
                    is ImageUri.ResImage->it.image.resID
                    is ImageUri.WebImage->it.image.webUrl
                    else -> IllegalArgumentException("타입 오류")
                }
                listOf(img,it.likes,it.dislikes,it.buttonType)
            },
            restore = {
                val imageUri = it[0]
                val img = when(it[0]){
                    is Int -> ImageUri.ResImage(imageUri as Int)
                    is String -> ImageUri.WebImage(imageUri as String)
                    else -> IllegalArgumentException("타입 오류")
                }
                ImageData(
                    image = img as ImageUri,
                    buttonType = it[1] as ButtonType,
                    likes = it[2] as Int,
                    dislikes = it[3] as Int
                )
            }
        )
    }
}
