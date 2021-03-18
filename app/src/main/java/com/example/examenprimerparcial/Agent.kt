package com.example.examenprimerparcial

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Agent(var foto: Int, var nombre: String, var nacionalidad: String, var tipoAgente: String, var fraseAgente: String) : Parcelable
