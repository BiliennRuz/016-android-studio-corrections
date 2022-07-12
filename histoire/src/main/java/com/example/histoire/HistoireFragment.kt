package com.example.histoire

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import com.example.histoire.databinding.FragmentHistoireBinding


class HistoireFragment : Fragment() {
    lateinit var binding: FragmentHistoireBinding
    lateinit var vm : HistoireViewModel
    val args: HistoireFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  FragmentHistoireBinding.inflate(inflater, container, false)
        vm = ViewModelProvider(this).get(HistoireViewModel::class.java)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //val histoireFragArgs = arguments?.let { HistoireFragmentArgs.fromBundle(it) }
        vm.setHistoire(args.histoire)
        vm.histoire.observe(viewLifecycleOwner, Observer { binding.histoire = it })
        binding.buttonChangeHistoire.setOnClickListener {
            vm.setPrenom(binding.editTextPrenom.text.toString())
        }
    }

}