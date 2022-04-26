package com.tinydavid.snoocodeauto.ui

import android.location.Location
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    private val _location = MutableLiveData<Location>()
    val location: LiveData<Location> = _location

    fun setLocation(location: Location?) {
        if (location != null)
            _location.value = location
    }
}