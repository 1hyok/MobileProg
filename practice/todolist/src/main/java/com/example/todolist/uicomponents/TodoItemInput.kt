package com.example.todolist.uicomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todolist.model.Item
import com.example.todolist.model.TodoItemFactory
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Composable
fun TodoItemInput(modifier: Modifier = Modifier, todolist: SnapshotStateList<Item>) {
    var state by remember { mutableStateOf("") }
    Row(horizontalArrangement = Arrangement.SpaceAround) {
        TextField(
            value = state,
            onValueChange = { state = it },
            modifier = Modifier.padding(4.dp)
        )
        Button(
            {
                todolist.add(
                    Item(
                        content = state,
                        time = LocalDateTime.now()
                            .format(DateTimeFormatter.ofPattern("MM-dd HH:mm")),
                    )
                )
            },
            modifier = Modifier
                .padding(
                    end = 4.dp
                )
                .align(Alignment.CenterVertically)
        ) {
            Text("추가")
        }
    }
}

@Preview
@Composable
private fun TodoItemInputPreview() {
    TodoItemInput(todolist = TodoItemFactory.makeTodoList())
}