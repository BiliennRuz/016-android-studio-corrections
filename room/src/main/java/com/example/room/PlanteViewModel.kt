package com.example.room

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class PlanteViewModel(planteDao: PlanteDao,application: Application)
    :AndroidViewModel(application){
    var listePlantes = arrayListOf<Plante>()
    init {
        viewModelScope.launch {
            listePlantes = ArrayList(planteDao.getAll())
        }
    }
}
