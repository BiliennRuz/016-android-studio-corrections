package com.example.histoire

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Histoire(
    var prenom:String,
    var genre:String,
    var lieu:String
) : Parcelable
