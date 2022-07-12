package com.example.room

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var vm : PlanteViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val app =  requireNotNull(application)
        vm = ViewModelProvider(this,VMFactory(app))
            .get(PlanteViewModel::class.java)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Toast.makeText(this, vm.listePlantes.toString(), Toast.LENGTH_SHORT).show()
        }
        //thread {
        //    PlanteDatabase.getInstance(this).planteDao().insert(
        //        Plante(0,"Blette","legumineux", false),
        //    )
        //    PlanteDatabase.getInstance(this).planteDao().insert(
        //        Plante(0,"Rhubarbe","fruiteuse", true),
        //    )
        //}
    }
}