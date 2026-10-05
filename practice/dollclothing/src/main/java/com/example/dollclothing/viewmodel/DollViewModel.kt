package com.example.dollclothing.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel

class DollViewModel: ViewModel() {
    private val _checkList = mutableStateListOf(*Array(10) { false })
    val checkList
        get() = _checkList
}