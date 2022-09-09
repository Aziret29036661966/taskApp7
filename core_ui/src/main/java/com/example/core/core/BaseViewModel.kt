package com.example.core.core

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

abstract class BaseViewModel: ViewModel(){

    protected fun <T> Flow<Resource<T>>.getData(
        returnError: (message: String?) -> Unit,
        returnLoading: () -> Unit,
        returnSuccess: (data: T?) -> Unit
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            this@getData.collect {
                when(it) {
                    is Resource.Error -> {
                        returnError(it.message)
                    }
                    is Resource.Loading -> {
                        returnLoading()
                    }
                    is Resource.Success -> {
                        if (it.data != null) {
                            returnSuccess(it.data)
                        }
                    }
                }
            }
        }
    }
}