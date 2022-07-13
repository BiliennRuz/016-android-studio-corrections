package com.example.room

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface PlanteDao {
    @Insert
    fun insert(plante: Plante)

    @Query("SELECT * FROM Plante")
    fun getAll() : LiveData<List<Plante>>

    @Query("SELECT * FROM Plante WHERE perenne = :perenne")
    fun getAllPlantesByPerennite(perenne : Boolean): List<Plante>

    @Update
    fun update(plante: Plante)

    @Delete
    fun delete(plante: Plante)
}