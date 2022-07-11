package com.example.viewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var vm : CompteurViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        vm = ViewModelProvider(this).get(CompteurViewModel::class.java)

        //TODO Afficher le compteur
        binding.textViewCompteur.text = vm.compteur.toString()
        //TODO lorsque le bouton est appuyé, incrémenter le compteur depuis le VM
        // et afficher le compteur
        binding.fabCompteur.setOnClickListener {
            vm.increment()
            binding.textViewCompteur.text = vm.compteur.toString()
        }
    }
}