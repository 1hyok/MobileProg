package com.example.dollclothing.uicomponents

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.dollclothing.viewmodel.DollViewModel

@Composable
fun MainScreen() {
    val checkList = viewModel<DollViewModel>().checkList

    val orientation = LocalConfiguration.current.orientation
    if (orientation == Configuration.ORIENTATION_PORTRAIT) {

        Column(
            Modifier.fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            ClothesImage(
                modifier = Modifier.weight(0.4f),
                checkList = checkList
            )
            ClothesList(
                modifier = Modifier.weight(0.4f),
                checkList = checkList
            )
        }

    } else {

        Row(
//        Modifier.fillMaxHeight(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            ClothesImage(
                modifier = Modifier.weight(0.4f),
                checkList = checkList
            )
            ClothesList(
                modifier = Modifier.weight(0.9f),
                checkList = checkList
            )
        }

    }
}

@Preview(
    showBackground = true,//프리뷰 배경 설정
    widthDp = Int.MAX_VALUE,//프리뷰 최대 크기로
    heightDp = Int.MAX_VALUE
)
@Composable
fun MainScreenPreview() {
    MainScreen()
}