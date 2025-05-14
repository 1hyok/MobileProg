package com.example.week11.example01

// 설치 라이브러리
// org.jsoup:jsoup
// androidx.compose.material:material

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun FetchDaumNews(newsViewModel: NewsViewModel = viewModel()) {
    val newsList = newsViewModel.newsList

    LaunchedEffect(Unit) {
        newsViewModel.fetchNews()
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        NewsList(list = newsList)
    }
}