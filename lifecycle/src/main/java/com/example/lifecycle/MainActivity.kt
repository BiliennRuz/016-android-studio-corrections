package com.example.lifecycle

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var fab : FloatingActionButton
    lateinit var textViewCompteur : TextView
    var compteur = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab = findViewById(R.id.floatingActionButton)
        textViewCompteur = findViewById(R.id.textViewCompteur)
        textViewCompteur.text = compteur.toString()

        fab.setOnClickListener{
            compteur++
            textViewCompteur.text = compteur.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        //En déménageant (on emporte le compteur)
        outState?.putInt("compteur",compteur)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        //En réemmenageant,on restore le compteur
        compteur = savedInstanceState.getInt("compteur")
        textViewCompteur.text = compteur.toString()
    }
}