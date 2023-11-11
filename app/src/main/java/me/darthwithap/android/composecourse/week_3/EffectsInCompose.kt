package me.darthwithap.android.composecourse.week_3

import android.util.Log
import androidx.compose.runtime.Composable

@Composable
fun EffectsInCompose() {

}


// Pure function - same inputs give same output
// Cacheable and can be stored in a key value pair map
fun addition(n1: Int, n2: Int): Int {
    return n1 + n2
}

fun anotherAddition(n1: Int, n2: Int): Int {
    // Log is something outside the scope of the function
    // Not related to the function, it is something additional
    Log.d("Calculator", "another addition called")
    return n1 + n2
}


// Another example of effects
val numbersCalled: MutableList<Int> = mutableListOf()
fun lastAddition(n1: Int, n2: Int): Int {
    // This is an effect
    numbersCalled.add(n1)
    numbersCalled.add(n2)
    return n1 + n2
}