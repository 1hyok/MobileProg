package com.example.dollclothing.uicomponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil3.compose.AsyncImage
import com.example.dollclothing.R
import com.example.dollclothing.model.ClothType

@Composable
fun ClothesImage(
    modifier: Modifier = Modifier,
    checkList: MutableList<Boolean>
) {
    Box(modifier,
        contentAlignment = Alignment.Center) {
        AsyncImage(
            model = R.drawable.body,
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )
        checkList.filter {
            it == true
        }.forEachIndexed { index, check ->//리스트에서 조건에 맞는 요소 가져오기
            AsyncImage(
                model = ClothType.resIdList[index],
                contentDescription = null,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}

@Preview
@Composable
fun ClothesImagePreview() {
//    ClothesImage()
}