package com.example.lancerdevm

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.lancerdevm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: LancerDeViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(LancerDeViewModel::class.java)

        //Initialisation de champs UI
        binding.editTextMaxFaces.setText(viewModel.nbFaces.toString())
        binding.textViewValueDice.text = viewModel.valeurDe.toString()

        binding.floatingActionButton.setOnClickListener {
            viewModel.lancerDe()
            binding.textViewValueDice.text = viewModel.valeurDe.toString()
        }
        binding.buttonValiderFaces.setOnClickListener {
            val nbFacesMax = binding.editTextMaxFaces.text.toString().toIntOrNull()
            if(nbFacesMax == null){
                Toast.makeText(this, "Merci de rentrer un nombre", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }else{
                viewModel.nbFaces = nbFacesMax
            }

        }
    }
}