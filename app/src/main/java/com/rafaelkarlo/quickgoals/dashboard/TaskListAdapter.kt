package com.rafaelkarlo.quickgoals.dashboard

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.rafaelkarlo.quickgoals.R

class TaskListAdapter(var tasks: Array<Task>) : RecyclerView.Adapter<TaskListAdapter.ViewHolder>() {

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.titleView.text = tasks[position].name
        viewHolder.dateCreatedView.text = "Created ${tasks[position].timeCreated.toString("YYYY-MM-dd")}"
    }

    override fun getItemCount(): Int = tasks.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.task_view, parent, false)
        return ViewHolder(view)
    }

    class ViewHolder(viewGroup: View) : RecyclerView.ViewHolder(viewGroup) {
        var titleView = viewGroup.findViewById(R.id.task_name) as TextView
        var dateCreatedView = viewGroup.findViewById(R.id.date_created) as TextView
    }

}