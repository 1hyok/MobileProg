package com.example.imglist.uicomponents

import android.content.res.Configuration
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import com.example.imglist.model.ButtonType
import com.example.imglist.model.ImageData
import com.example.imglist.model.ImageListFactory
import kotlinx.coroutines.launch

@Composable
fun ImageList(
    modifier: Modifier = Modifier,
    imageList: MutableList<ImageData>
) {
    val state = rememberLazyListState()
    val showButton by remember {
        derivedStateOf {
            state.firstVisibleItemIndex > 0
        }
    }

    val scope = rememberCoroutineScope()

    val orientation = LocalConfiguration.current.orientation
    if (orientation == Configuration.ORIENTATION_PORTRAIT){
        LazyColumn(
            Modifier.fillMaxWidth(),
            state = state,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            itemsIndexed(items = imageList) { index, imageData ->
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
        AnimatedVisibility(showButton) {
            ScrollToTopButton {
                scope.launch {
                    state.scrollToItem(0)
                }
            }
        }
    }else{
        LazyRow(
            Modifier.fillMaxHeight(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            itemsIndexed(items = imageList) { index, imageData ->
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
}

@Preview
@Composable
fun ImageListPreview() {
    ImageList(
        imageList = ImageListFactory.makeImageList()
    )
}