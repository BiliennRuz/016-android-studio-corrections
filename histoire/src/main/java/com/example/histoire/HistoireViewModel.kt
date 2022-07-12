package com.example.histoire

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HistoireViewModel : ViewModel() {
    var histoire = MutableLiveData<Histoire>()
    init {
        histoire.value = Histoire("Jean-Paul", "Homme","Chateau de Pignerolles")
    }

    fun setHistoire(histoire: Histoire){
        this.histoire?.value = histoire
    }
    fun setPrenom(prenom: String){
        val histoireToChange = this.histoire.value
        histoireToChange?.prenom = prenom
        histoireToChange?.let { histoire.value = it }
    }
}