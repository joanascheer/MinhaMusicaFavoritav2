package br.com.zup.minhamusicafavoritav2.home.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.zup.minhamusicafavorita.model.Album
import br.com.zup.minhamusicafavoritav2.home.repository.HomeRepository

class HomeViewModel() : ViewModel() {
    private val repository = HomeRepository()
    private val _response: MutableLiveData<List<Album>> = MutableLiveData()
    val response: LiveData<List<Album>> = _response

    fun getAllAlbuns() {
        try {
            _response.value = repository.getAlbumList()
        }catch (e: Exception) {
            Log.i("Error", "----> ${e.message}")
        }
    }

}