package com.example.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
class CompteurViewModel : ViewModel() {
    var compteur = MutableLiveData<Int>();

    init {
        compteur.value = 0
    }

    fun increment() {
        compteur.value = compteur.value?.inc()
    }

    //fun increment() : Int{
    //    return ++compteur;
    //}
}

