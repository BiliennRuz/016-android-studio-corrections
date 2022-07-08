package com.example.tphistoire

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


class HistoireFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_histoire, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args : HistoireFragmentArgs? = arguments?.let { HistoireFragmentArgs.fromBundle(it) }
        val histoire : Histoire? = args?.h
        val textView = view.findViewById<TextView>(R.id.textViewHistoire)
        textView.text = "Il était un fois un être nommé ${histoire?.prenom} qui vivait" +
                " dans un(e) ${histoire?.lieu}..."
    }
}