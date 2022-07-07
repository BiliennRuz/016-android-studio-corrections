package com.example.navigationsafeargs

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val prenom: String,
    val nom: String,
    val age: Int
) : Parcelable
