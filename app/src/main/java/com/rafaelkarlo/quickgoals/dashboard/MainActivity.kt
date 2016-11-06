package com.rafaelkarlo.quickgoals.dashboard

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import com.rafaelkarlo.quickgoals.R
import com.rafaelkarlo.quickgoals.dashboard.TaskStatus.CREATED
import org.joda.time.LocalDateTime.now

class MainActivity : AppCompatActivity() {

    private val sampleCreatedTime = now()
    private val sampleTasks = arrayOf(
            Task("Program in KOTLIN", "Just for lols", sampleCreatedTime, sampleCreatedTime, CREATED),
            Task("Program in JAVA", "Just for lols", sampleCreatedTime, sampleCreatedTime, CREATED),
            Task("Program in Clojure", "Just for lols", sampleCreatedTime, sampleCreatedTime, CREATED),
            Task("Program in Python", "Just for lols", sampleCreatedTime, sampleCreatedTime, CREATED),
            Task("Program in ML", "Just for lols", sampleCreatedTime, sampleCreatedTime, CREATED),
            Task("Program in Scheme", "Just for lols", sampleCreatedTime, sampleCreatedTime, CREATED),
            Task("Program in Scala", "Just for lols", sampleCreatedTime, sampleCreatedTime, CREATED),
            Task("Program in Haskell", "Just for lols", sampleCreatedTime, sampleCreatedTime, CREATED),
            Task("Program in Ruby", "Just for lols", sampleCreatedTime, sampleCreatedTime, CREATED)
    )

    @BindView(R.id.add_task_button)
    lateinit var addTaskButton: FloatingActionButton

    @BindView(R.id.task_list_container)
    lateinit var taskList: RecyclerView

    override
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        initializeList()
    }

    @OnClick(R.id.add_task_button)
    fun showMessage() {
        Toast.makeText(this, "Hello World", LENGTH_LONG).show()
    }

    private fun initializeList() {
        taskList.layoutManager = LinearLayoutManager(this)
        taskList.adapter = TaskListAdapter(sampleTasks)
    }
}
