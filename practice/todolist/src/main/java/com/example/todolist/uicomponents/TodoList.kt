package com.example.todolist.uicomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todolist.model.Item
import com.example.todolist.model.TodoItemFactory
import com.example.todolist.model.TodoStatus

@Composable
fun TodoList(
    modifier: Modifier = Modifier,
    todoList: MutableList<Item>,
    showPending: Boolean
) {
//    TodoItem(todoList=todoList)
    Column(
        modifier.fillMaxWidth()
    ) {
        todoList.forEach { item ->
            if (!showPending || item.status == TodoStatus.PENDING) {
                Card(
                    Modifier
                        .fillMaxWidth()
                        .padding(4.dp)
                ) {
                    Row {
                        TodoCheckbox(
                            item.status == TodoStatus.COMPLETED,
                        ) { checked ->
                            todoList[todoList.indexOf(item)] = item.copy(
                                status = if (checked)
                                    TodoStatus.COMPLETED
                                else
                                    TodoStatus.PENDING
                            )
                        }
                        TodoItem(item = item)
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