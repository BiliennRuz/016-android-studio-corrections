package com.example.viewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    lateinit var vm : CompteurViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        vm = ViewModelProvider(this).get(CompteurViewModel::class.java)

        //Dès que le compteur changer j'effectue les actions dans l'Observer
        //avec "it" comme nouvelle valeur
        vm.compteur.observe(this, Observer {
            binding.textViewCompteur.text = it?.toString()
        })
        //TODO lorsque le bouton est appuyé, incrémenter le compteur depuis le VM
        // et afficher le compteur
        binding.fabCompteur.setOnClickListener {
            vm.increment()
        }
    }
}