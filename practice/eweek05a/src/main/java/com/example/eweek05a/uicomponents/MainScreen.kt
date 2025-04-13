package com.example.eweek05a.uicomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.eweek05a.viewmodel.ImageViewModel

@Composable
fun MainScreen(
    imageViewModel: ImageViewModel = viewModel()
) {
    Column(Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceAround) {
        ImageList(
            imageList = imageViewModel.imageList
        )
    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    MainScreen()
}