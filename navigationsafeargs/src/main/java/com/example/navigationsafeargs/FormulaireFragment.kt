package com.example.navigationsafeargs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigationsafeargs.databinding.FragmentFormulaireBinding


class FormulaireFragment : Fragment() {
    lateinit var binding : FragmentFormulaireBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFormulaireBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            val user = User(
                binding.editTextPrenom.text.toString(),
                binding.editTextNom.text.toString(),
                binding.editTextAge.text.toString().toInt()
            )
            //On prépare la navigation avec le user en argument
            val action = FormulaireFragmentDirections.actionFormToResult(user)
            //On navigue vers la direction
            Navigation.findNavController(view).navigate(action)
        }
    }
}





