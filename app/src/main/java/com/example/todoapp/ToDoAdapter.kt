package com.example.todoapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.todoapp.database.Todo
import com.example.todoapp.database.TodoRepository

class TodoAdapter(items:List<Todo>, repository: TodoRepository,
                  viewModel:MainActivityData):Adapter<ToDoViewHolder>() {
    var context: Context? = null
    val items = items
    val repository = repository
    val viewModel = viewModel
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_item,parent,false)
        context = parent.context
        return ToDoViewHolder(view)
    }


    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        holder.cbTodo.text = "Sample Test"
    }

    override fun getItemCount(): Int {
        return 1
    }
}
