package com.example.todolist.viewmodel

import androidx.lifecycle.ViewModel
import com.example.todolist.model.Item
import com.example.todolist.model.TodoItemFactory

class TodoViewModel: ViewModel() {
    private val _todoList = TodoItemFactory.makeTodoList()
    val todoList: MutableList<Item>
        get() {
            return _todoList
        }
}