package com.example.todolist.uicomponents

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun TodoListTitle(modifier: Modifier = Modifier) {
    Text(
        "To-Do List",
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        modifier = modifier
    )
}

@Preview
@Composable
private fun TodoListTitlePreview() {
    TodoListTitle()
}