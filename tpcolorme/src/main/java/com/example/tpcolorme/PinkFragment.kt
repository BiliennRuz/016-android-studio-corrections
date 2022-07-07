package com.example.tpcolorme

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation


class PinkFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pink, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.buttonToYellowOrGreen)
        button.setOnClickListener {
            if((0..1).random()==0){
                Navigation.findNavController(view).navigate(
                    R.id.action_pinkFragment_to_yellowFragment)
            }else{
                Navigation.findNavController(view).navigate(
                    R.id.action_pinkFragment_to_greenFragment)

            }
        }
    }
}