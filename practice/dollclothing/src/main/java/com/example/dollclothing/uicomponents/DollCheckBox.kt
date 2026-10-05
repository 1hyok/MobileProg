package com.example.dollclothing.uicomponents

import androidx.compose.material3.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DollCheckBox(modifier: Modifier = Modifier, checked: Boolean, onCheckedChange:(Boolean)->Unit) {
    Checkbox(
        modifier = modifier,
        checked = checked,
        onCheckedChange = onCheckedChange
    )
}
@Preview
@Composable
fun DollCheckBoxPreview() {
    var checked by remember { mutableStateOf(false) }
    DollCheckBox(checked=checked){
        checked = it
    }
}