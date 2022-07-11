package com.example.lancerdevm

import androidx.lifecycle.ViewModel

class LancerDeViewModel : ViewModel(){
    var valeurDe = 1;
    var nbFaces = 6

    fun lancerDe(){
        valeurDe = (1..nbFaces).random()
    }
    fun setMaxFaces(nbFaces : Int){
        this.nbFaces = nbFaces
    }
}