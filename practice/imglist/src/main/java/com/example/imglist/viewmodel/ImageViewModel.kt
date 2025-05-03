package com.example.imglist.viewmodel

import androidx.lifecycle.ViewModel
import com.example.imglist.model.ImageData
import com.example.imglist.model.ImageListFactory

class ImageViewModel: ViewModel() {
    private val _imageList = ImageListFactory.makeImageList()
    val imageList: MutableList<ImageData>
        get() = _imageList
}