package com.example.todolist.uicomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todolist.model.Item
import com.example.todolist.model.TodoItemFactory
import com.example.todolist.model.TodoStatus

@Composable
fun TodoList(modifier: Modifier = Modifier, todoList: MutableList<Item>, showPending: Boolean) {
//    TodoItem(todoList=todoList)
    Column(modifier.fillMaxWidth()) {
        todoList.forEachIndexed { index,item ->
            var checkState by remember {
                mutableStateOf(
                    if (item.status == TodoStatus.COMPLETED)
                        true
                    else
                        false
                )
            }
            if ((!showPending && item.status == TodoStatus.COMPLETED) || (showPending && item.status == TodoStatus.PENDING)) {
                Card(
                    Modifier
                        .fillMaxWidth()
                        .padding(4.dp)
                ) {
                    Row {
                        var show = false;
                        Checkbox(
                            checked = checkState,
                            onCheckedChange = {
                                checkState = it
                                if (it) {
//                                    item.status = TodoStatus.COMPLETED
                                    todoList[index] = item.copy(status = TodoStatus.COMPLETED)
                                } else {
//                                    item.status = TodoStatus.PENDING
                                    todoList[index] = item.copy(status = TodoStatus.PENDING)
                                }
                            }
                        )
                        Column {
                            Text(
                                item.content,
                                textDecoration = if (item.status == TodoStatus.PENDING)
                                    null
                                else
                                    TextDecoration.LineThrough
                            )
                            Text(item.time)
                        }
                    }
                }
            }

        }
    }
}

@Preview
@Composable
private fun TodoListPreview() {
    TodoList(todoList = TodoItemFactory.makeTodoList(), showPending = true)
}