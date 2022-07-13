package com.example.recyclerviewwine

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val alWine = arrayListOf<Wine>(
            Wine("Coteaux de l'Aubance", "Château de Mauny", 2012, Type.BLANC),
            Wine("Coteaux de l'Aubance", "Château de Mauny", 2012, Type.BLANC),
            Wine("Coteaux de l'Aubance", "Château de Mauny", 2012, Type.BLANC),
            Wine("Coteaux de l'Aubance", "Château de Mauny", 2012, Type.BLANC),
            Wine("Coteaux de l'Aubance", "Château de Mauny", 2012, Type.BLANC),
            Wine("Coteaux de l'Aubance", "Château de Mauny", 2012, Type.BLANC),
            Wine("Coteaux de l'Aubance", "Château de Mauny", 2012, Type.BLANC),
            Wine("Coteaux de l'Aubance", "Château de Mauny", 2012, Type.BLANC),
            Wine("Coteaux de l'Aubance", "Château de Mauny", 2012, Type.BLANC),
            Wine("Coteaux de l'Aubance", "Château de Mauny", 2012, Type.BLANC),
            Wine("Coteaux de l'Aubance", "Château de Mauny", 2012, Type.BLANC),
            Wine("Coteaux de l'Aubance", "Château de Mauny", 2012, Type.BLANC),
            Wine("Coteaux de l'Aubance", "Château de Mauny", 2012, Type.BLANC),
            Wine("Coteaux de l'Aubance", "Château de Mauny", 2012, Type.BLANC),
            Wine("Elodiance", "Caves du Val de France", 2016, Type.ROSE),
            Wine("Elodiance", "Caves du Val de France", 2016, Type.ROSE),
            Wine("Elodiance", "Caves du Val de France", 2016, Type.ROSE),
            Wine("Elodiance", "Caves du Val de France", 2016, Type.ROSE),
            Wine("Elodiance", "Caves du Val de France", 2016, Type.ROSE),
            Wine("Elodiance", "Caves du Val de France", 2016, Type.ROSE),
            Wine("Elodiance", "Caves du Val de France", 2016, Type.ROSE),
            Wine("Elodiance", "Caves du Val de France", 2016, Type.ROSE),
            Wine("Elodiance", "Caves du Val de France", 2016, Type.ROSE),
            Wine("Elodiance", "Caves du Val de France", 2016, Type.ROSE),
            Wine("Elodiance", "Caves du Val de France", 2016, Type.ROSE),
            Wine("Elodiance", "Caves du Val de France", 2016, Type.ROSE),
            Wine("Elodiance", "Caves du Val de France", 2016, Type.ROSE),
            Wine("Elodiance", "Caves du Val de France", 2016, Type.ROSE),
            Wine("Val de Loire", "Château de Mauny", 2012, Type.ROUGE),
            Wine("Val de Loire", "Château de Mauny", 2012, Type.ROUGE),
            Wine("Val de Loire", "Château de Mauny", 2012, Type.ROUGE),
            Wine("Val de Loire", "Château de Mauny", 2012, Type.ROUGE),
            Wine("Val de Loire", "Château de Mauny", 2012, Type.ROUGE),
            Wine("Val de Loire", "Château de Mauny", 2012, Type.ROUGE),
            Wine("Val de Loire", "Château de Mauny", 2012, Type.ROUGE),
            Wine("Val de Loire", "Château de Mauny", 2012, Type.ROUGE),
            Wine("Val de Loire", "Château de Mauny", 2012, Type.ROUGE),
            Wine("Val de Loire", "Château de Mauny", 2012, Type.ROUGE),
            Wine("Alias Pinot Noire", "Vin de Val de Loire", 2012, Type.ROUGE),
            Wine("Alias Pinot Noire", "Vin de Val de Loire", 2012, Type.ROUGE),
            Wine("Alias Pinot Noire", "Vin de Val de Loire", 2012, Type.ROUGE),
            Wine("Alias Pinot Noire", "Vin de Val de Loire", 2012, Type.ROUGE),
            Wine("Alias Pinot Noire", "Vin de Val de Loire", 2012, Type.ROUGE),
            Wine("Alias Pinot Noire", "Vin de Val de Loire", 2012, Type.ROUGE),
            Wine("Alias Pinot Noire", "Vin de Val de Loire", 2012, Type.ROUGE),
            Wine("Alias Pinot Noire", "Vin de Val de Loire", 2012, Type.ROUGE),
            Wine("Alias Pinot Noire", "Vin de Val de Loire", 2012, Type.ROUGE),
            Wine("Alias Pinot Noire", "Vin de Val de Loire", 2012, Type.ROUGE),
            Wine("Alias Pinot Noire", "Vin de Val de Loire", 2012, Type.ROUGE),
            Wine("Billecart", "Salmon Blanc de Blanc", 2002, Type.PETILLANT),
            Wine("Billecart", "Salmon Blanc de Blanc", 2002, Type.PETILLANT),
            Wine("Billecart", "Salmon Blanc de Blanc", 2002, Type.PETILLANT),
            Wine("Billecart", "Salmon Blanc de Blanc", 2002, Type.PETILLANT),
            Wine("Billecart", "Salmon Blanc de Blanc", 2002, Type.PETILLANT),
            Wine("Billecart", "Salmon Blanc de Blanc", 2002, Type.PETILLANT),
            Wine("Billecart", "Salmon Blanc de Blanc", 2002, Type.PETILLANT),
            Wine("Billecart", "Salmon Blanc de Blanc", 2002, Type.PETILLANT),
            Wine("Billecart", "Salmon Blanc de Blanc", 2002, Type.PETILLANT),
            Wine("Billecart", "Salmon Blanc de Blanc", 2002, Type.PETILLANT),
            Wine("Billecart", "Salmon Blanc de Blanc", 2002, Type.PETILLANT),
            Wine("Billecart", "Salmon Blanc de Blanc", 2002, Type.PETILLANT),
            Wine("Billecart", "Salmon Blanc de Blanc", 2002, Type.PETILLANT),
        )
        val rv = findViewById<RecyclerView>(R.id.recyclerVIewWine)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = WineAdapter(alWine)

    }
}