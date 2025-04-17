package com.example.todolist.model

data class Item(
    val content: String,
    val time:String,
    var status: TodoStatus = TodoStatus.PENDING
)