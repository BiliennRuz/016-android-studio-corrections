package com.example.lancerdevm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LancerDeViewModel : ViewModel(){
    var valeurDe = MutableLiveData<Int>();
    var nbFaces = 6

    init{
        valeurDe.value = 1
    }

    fun lancerDe(nbFaces : Int){
        setMaxFaces(nbFaces)
        valeurDe.value = (1..nbFaces).random()
    }
    fun setMaxFaces(nbFaces : Int){
        this.nbFaces = nbFaces
    }
}