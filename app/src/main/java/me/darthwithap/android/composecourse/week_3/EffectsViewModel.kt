package me.darthwithap.android.composecourse.week_3

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class EffectsViewModel : ViewModel() {
    val state: MutableState<ViewModelState> = mutableStateOf(ViewModelState.Loading)

    fun loadData() {
        viewModelScope.launch {
            state.value = ViewModelState.Loading
            // Mimic API call
            delay(2000)
            state.value = ViewModelState.Success()
        }
    }
}

sealed class ViewModelState {
    object Loading : ViewModelState()
    data class Success(
        val data: String = "Loaded Data",
        val timestamp: Long = System.currentTimeMillis(),
        val validity: Long = 10000L
    ) : ViewModelState()

    data class Error(
        val errorData: String
    ) : ViewModelState()
}