package com.example.histoire

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.histoire.databinding.FragmentFormBinding


class FormFragment : Fragment() {
    lateinit var binding : FragmentFormBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFormBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            val histoire = Histoire(
                binding.editTextPrenom.text.toString(),
                binding.editTextGenre.text.toString(),
                binding.editTextLieu.text.toString(),
            )
            val action = FormFragmentDirections.actionFormToHistoire(histoire)
            Navigation.findNavController(view).navigate(action)
        }
    }

}