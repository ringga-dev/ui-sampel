package com.ringga.comunity.antarMuka.home.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text


    private val _textdas = MutableLiveData<String>().apply {
        value = "This is dasboar Fragment"
    }
    val textdas: LiveData<String> = _textdas

    private val _textvof = MutableLiveData<String>().apply {
        value = "This is notifikasi Fragment"
    }
    val textnof: LiveData<String> = _textvof
}
