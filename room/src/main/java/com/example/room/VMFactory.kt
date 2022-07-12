package com.example.room

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class VMFactory(val application: Application) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        //Si le viewModel voulu est un Plante ViewModel alors on injecte la PlanteDao
        if(modelClass.isAssignableFrom(PlanteViewModel::class.java)){
            var planteDao = PlanteDatabase.getInstance(application).planteDao()
            return PlanteViewModel(planteDao,application) as T
        }
        throw  IllegalArgumentException("Le view Model n'est pas connu")
    }
}