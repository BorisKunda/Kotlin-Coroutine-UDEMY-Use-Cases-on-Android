package com.lukaslechner.coroutineusecasesonandroid.playground.boris

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {

    launch {
        foo("HELLO BORIS")
    }

}

private suspend fun foo(string: String) {
    print(string)
}

