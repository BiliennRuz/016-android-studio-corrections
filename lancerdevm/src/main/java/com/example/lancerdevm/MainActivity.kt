package com.example.lancerdevm

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lancerdevm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() , View.OnClickListener {
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: LancerDeViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(LancerDeViewModel::class.java)

        //Initialisation de champs UI
        binding.editTextMaxFaces.setText(viewModel.nbFaces.toString())

        //A chaque fois que la valeurDé change, je l'affecte à mon dataBinding
        //ce qui occasionne le changement des 4 textView affichant la valeur du dé
        viewModel.valeurDe.observe(this, Observer { binding.valDe = it })

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
    //A chaque fois qu'un click est fait sur les boutons de lancer,
    //on déclenche la méthode de lancer en fonction du bouton cliqué
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.button6 -> viewModel.lancerDe(6)
            R.id.button16 -> viewModel.lancerDe(16)
            R.id.button12 -> viewModel.lancerDe(12)
            R.id.button4 -> viewModel.lancerDe(4)
            R.id.button20 -> viewModel.lancerDe(20)
            R.id.button8 -> viewModel.lancerDe(8)
        }
    }
}