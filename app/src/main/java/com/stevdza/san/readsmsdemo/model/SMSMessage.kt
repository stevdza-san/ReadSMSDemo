package com.stevdza.san.readsmsdemo.model

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

data class SMSMessage(
    val message: String,
    val sender: String,
    val date: Long,
    val read: Boolean,
    val type: Int,
    val thread: Int,
    val service: String
)

fun Long.parsedDate(): String {
    val date = Date(this)
    val format = SimpleDateFormat("dd/MMM/yyyy HH:mm", Locale.getDefault())
    return format.format(date)
}