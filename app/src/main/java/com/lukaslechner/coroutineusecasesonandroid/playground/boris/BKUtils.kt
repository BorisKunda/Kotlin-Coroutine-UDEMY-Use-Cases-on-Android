package com.lukaslechner.coroutineusecasesonandroid.playground.boris

import android.util.Log

fun printD(message: String = "message_debug") {
    Log.d("**BK-DEBUG**", message)
}

fun printE(message: String = "message_error") {
    Log.e("**BK-DEBUG**", message)
}

fun printI(message: String = "message_info") {
    Log.i("**BK-DEBUG**", message)
}


