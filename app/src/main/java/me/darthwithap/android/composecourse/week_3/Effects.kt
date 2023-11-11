package me.darthwithap.android.composecourse.week_3

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import kotlinx.coroutines.delay

@Composable
fun Effects(
    viewModel: EffectsViewModel
) {
    val state = viewModel.state.value
    var currentTime by remember {
        mutableLongStateOf(System.currentTimeMillis())
    }
    var lastChecked by remember {
        mutableLongStateOf(System.currentTimeMillis())
    }
    val isValid by remember(key1 = state, key2 = (currentTime - lastChecked) > 1000L) {
        Log.d("Effects", "Effects: Key reevaluated")
        lastChecked = currentTime
        mutableStateOf(
            state is ViewModelState.Success &&
                    ((currentTime - state.timestamp) > state.validity)
        )
    }

    LaunchedEffect(key1 = currentTime) {
        delay(1000)
        currentTime = System.currentTimeMillis()
    }

    // Calling this normally will mean calling again on recomposition, instead call in a launched effect
    //viewModel.loadData()

    LaunchedEffect(key1 = isValid) {
        if (!isValid) viewModel.loadData()
    }

    Box(modifier = Modifier.fillMaxSize()) {
        when (state) {
            is ViewModelState.Loading -> Text(text = "Loading")
            is ViewModelState.Success -> Text(text = "Success: ${state.data}")
            is ViewModelState.Error -> Text(text = "Success: ${state.errorData}")
        }
    }
}