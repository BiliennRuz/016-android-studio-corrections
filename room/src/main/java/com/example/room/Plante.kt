package com.example.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Plante(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val nom: String,
    val famille:String,
    val perenne: Boolean
)