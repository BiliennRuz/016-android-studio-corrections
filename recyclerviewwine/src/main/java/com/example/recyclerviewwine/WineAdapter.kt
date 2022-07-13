package com.example.recyclerviewwine

import com.example.recyclerviewwine.databinding.LineWineBinding
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class WineAdapter(var alWine:ArrayList<Wine>)
    : RecyclerView.Adapter<WineAdapter.WineViewHolder>(){

    class WineViewHolder(val binding: LineWineBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WineViewHolder {
        //On récupère le binding du layout beer_line.xml (interprétation du layout + récupération Binding)
        val binding = LineWineBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false)
        return WineViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WineViewHolder, position: Int) {
        //Afficher ma biere
        val biere = alWine[position]
        holder.binding.wine = biere
    }

    override fun getItemCount(): Int = alWine.size
}