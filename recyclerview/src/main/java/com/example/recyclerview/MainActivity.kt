package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import io.github.serpro69.kfaker.faker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val alBieres = arrayListOf<Biere>()
        val faker = faker{}

        data class Wine(val nom:String,val chateau:String,val annee:Int,val type:String)
        val alWine = arrayListOf<Wine>(
            Wine("Coteaux de l'Aubance", "Château de Mauny", 2012, "Blanc"),
            Wine("Elodiance", "Caves du Val de France", 2016, "Rosé"),
            Wine("Val de Loire", "Château de Mauny", 2012, "Rouge"),
            Wine("Alias Pinot Noire", "Vin de Val de Loire", 2012, "Rouge"),
            Wine("Billecart", "Salmon Blanc de Blanc", 2002, "Champagne"),
        )



        for(b in 0..500){
            alBieres.add(Biere(
                faker.beer.name(),
                (33..50).random(),
                faker.beer.style(),
                5.5f
            ))
        }

        val rv = findViewById<RecyclerView>(R.id.recyclerViewBieres)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = BiereAdapter(alBieres)
    }
}