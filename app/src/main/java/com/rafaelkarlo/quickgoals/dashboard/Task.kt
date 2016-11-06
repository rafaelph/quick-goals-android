package com.rafaelkarlo.quickgoals.dashboard

import org.joda.time.LocalDateTime

data class Task(val name: String,
                val description: String,
                val timeCreated: LocalDateTime,
                val timeFinished: LocalDateTime,
                val status: TaskStatus)