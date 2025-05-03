package com.example.todolist.uicomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.todolist.viewmodel.TodoViewModel

@Composable
fun MainScreen(
//    todoViewModel: TodoViewModel = viewModel()
) {

//    val todoList = remember {  TodoItemFactory.makeTodoList()}

    val todoViewModel:TodoViewModel = viewModel()
    val todoList = todoViewModel.todoList

    var switchState by remember { mutableStateOf(false) }

    Column(Modifier.fillMaxHeight()) {
        TodoListTitle()

        Row(
            Modifier.align(Alignment.End),//모디파이어는 자기 자채를 정렬. 바깥 요소에 따라 적절한 것 선택
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "미완료 항목만 보기",
                modifier = Modifier.padding(8.dp)
            )
            Switch(
                checked = switchState,
                onCheckedChange = {switchState=it}
            )
        }

        TodoList(
            todoList = todoList,
            modifier = Modifier.weight(1f),
            showPending = switchState
        )

        TodoItemInput(
            todolist = todoList
        )
    }
//    LazyColumn(Modifier.fillMaxHeight()) {
//        item{
//            TodoListTitle()
//        }
//        item{
//            Row(
//                Modifier.fillMaxWidth().padding(4.dp),
//                horizontalArrangement = Arrangement.End,
//                verticalAlignment = Alignment.CenterVertically
//            ) {
//                Text(
//                    "미완료 항목만 보기",
//                    modifier = Modifier.padding(8.dp)
//                )
//                Switch(
//                    checked = switchState,
//                    onCheckedChange = {switchState=it}
//                )
//            }
//        }
//        item{
//            TodoList(
//                todoList = todoList,
////                modifier = Modifier.weight(1f),
//                showPending = switchState
//            )
//        }
//        item{
//            TodoItemInput(
//                todolist = todoList
//            )
//        }
//    }
}



@Preview
@Composable
private fun MainScreenPreview() {
    MainScreen()
}