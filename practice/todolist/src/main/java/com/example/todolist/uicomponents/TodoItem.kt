package com.example.todolist.uicomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.todolist.model.Item
import com.example.todolist.model.TodoItemFactory
import com.example.todolist.model.TodoStatus

//@Composable
//fun TodoItem(modifier: Modifier = Modifier, todoList: MutableList<Item>) {
//    Column {
//        todoList.forEach {
//            Column {
//                Text(
//                    it.content,
//                    textDecoration = when (it.status) {
//                        TodoStatus.COMPLETED -> TextDecoration.LineThrough
//                        else -> null
//                    },
//                    fontSize = 16.sp
//                )
//                Spacer(Modifier.height(4.dp))
//                Text(
//                    it.time,
//                    fontSize = 16.sp
//                )
//            }
//        }
//    }
//}
//
//@Preview
//@Composable
//private fun TodoItemPreview() {
//    TodoItem(todoList = TodoItemFactory.makeTodoList())
//}