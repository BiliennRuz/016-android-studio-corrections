package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.LineBeerBinding

class BiereAdapter(var alBiere:ArrayList<Biere>)
    : RecyclerView.Adapter<BiereAdapter.BiereViewHolder>(){

    class BiereViewHolder(val binding: LineBeerBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BiereViewHolder {
        //On récupère le binding du layout beer_line.xml (interprétation du layout + récupération Binding)
        val binding = LineBeerBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false)
        return BiereViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BiereViewHolder, position: Int) {
        //Afficher ma biere
        val biere = alBiere[position]
        holder.binding.beer = biere
    }

    override fun getItemCount(): Int = alBiere.size
}