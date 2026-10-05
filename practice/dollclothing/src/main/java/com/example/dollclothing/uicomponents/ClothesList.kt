package com.example.dollclothing.uicomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.dollclothing.model.ClothType
import com.example.dollclothing.viewmodel.DollViewModel

@Composable
fun ClothesList(

    modifier: Modifier = Modifier,
    checkList: MutableList<Boolean>
) {
    Column(
        modifier
//        modifier.fillMaxWidth()
    ) {
        for (i in 0 until 5) {

            Row {
                for (j in 0 until 2) {

                    Row(
                        Modifier.weight(1f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {

                        DollCheckBox(
                            Modifier.padding(start = 30.dp),
                            checked = checkList[2 * i + j]
                        ) {
                            checkList[2 * i + j] = it
                        }

                        Text("${ClothType.nameList[2 * i + j]}")

                    }

                }
            }
        }
    }
}

@Preview
@Composable
fun ClothesListPreview() {
    ClothesList(checkList = viewModel<DollViewModel>().checkList)
}