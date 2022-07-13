package com.example.recyclerviewwine


enum class Type{
    BLANC,ROSE,ROUGE,PETILLANT,JAUNE
}
data class Wine(val nom:String, val chateau:String,val anne:Int,val type:Type)
