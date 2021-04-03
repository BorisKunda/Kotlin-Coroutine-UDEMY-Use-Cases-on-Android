package com.lukaslechner.coroutineusecasesonandroid.playground.boris

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {

var a: Deferred<String> = async {
    return@async "ABC"
}




}