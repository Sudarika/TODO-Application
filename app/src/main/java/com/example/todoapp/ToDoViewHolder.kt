package com.example.todoapp

import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ToDoViewHolder (view: View): RecyclerView.ViewHolder(view) {
    val cbTodo: CheckBox
    val ivDelete: ImageView
    init {
        cbTodo = view.findViewById(R.id.cbToDo)
        ivDelete = view.findViewById(R.id.ivDelete)
    }

}