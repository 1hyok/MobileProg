package com.example.todolist.uicomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.todolist.model.Item
import com.example.todolist.model.TodoItemFactory

@Composable
fun TodoItem(modifier: Modifier = Modifier, todoList: MutableList<Item>) {
    Column {
        todoList.forEach {
            Text(it.content)
//            Column {
//                Text(
//                    it.content,
//                    textDecoration = when (it.status) {
//                        TodoStatus.COMPLETED -> TextDecoration.LineThrough
//                        else -> null
//                    }
//                )
//                Text(it.time)
//            }
        }
    }
}

@Preview
@Composable
private fun TodoItemPreview() {
    TodoItem(todoList = TodoItemFactory.makeTodoList())
}