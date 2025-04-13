package com.example.eweek05a.viewmodel

import androidx.lifecycle.ViewModel
import com.example.eweek05a.model.ImagaListFactory
import com.example.eweek05a.model.ImageData

class ImageViewModel: ViewModel() {
    private var _imageList = ImagaListFactory.makeImageList()
    val imageList:MutableList<ImageData>
        get()=_imageList
}