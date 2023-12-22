package com.example.todoapp.database

class TodoRepository (
    private val db:TodoDatabase
) {
    suspend fun insert(todo:Todo) = db.getTodoDao().insertTodo(todo)
    suspend fun delete(todo:Todo) = db.getTodoDao().deleteTodo(todo)
    fun getAllTodoItems():List<Todo> = db.getTodoDao().getAllTodoItems()
}