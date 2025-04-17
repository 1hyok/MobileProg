package com.example.todolist.model

import androidx.compose.runtime.mutableStateListOf
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object TodoItemFactory {
    fun makeTodoList() = mutableStateListOf(
        Item(
            content = "씨발",
            time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd HH:mm")),
            status = TodoStatus.PENDING
        ),
        Item(
            content = "좆같다",
            time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd HH:mm")),
            status = TodoStatus.COMPLETED
        ),
        Item(
            content = "시험",
            time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd HH:mm")),
            status = TodoStatus.PENDING
        ),
        Item(
            content = "인생",
            time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd HH:mm")),
            status = TodoStatus.COMPLETED
        ),
        Item(
            content = "병신",
            time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd HH:mm")),
            status = TodoStatus.PENDING
        ),
        Item(
            content = "아아",
            time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd HH:mm")),
            status = TodoStatus.COMPLETED
        )
    )
}