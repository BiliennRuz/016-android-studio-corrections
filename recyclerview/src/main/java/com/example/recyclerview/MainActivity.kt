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