package com.example.movilessoftware2023

import android.os.Parcel
import android.os.Parcelable

class BEntrenador(
    var id: Int,
    var nombre: String?,
    var descripcion: String?,
):Parcelable {
    constructor(parcel: Parcel):this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString()
        ){}
    override fun toString(): String {
        return "${id} - ${nombre} - ${descripcion}"
    }

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(nombre)
        parcel.writeString(descripcion)
    }

    companion object CREATOR : Parcelable.Creator<BEntrenador> {
        override fun createFromParcel(parcel: Parcel): BEntrenador {
            return BEntrenador(parcel)
        }

        override fun newArray(size: Int): Array<BEntrenador?> {
            return arrayOfNulls(size)
        }
    }


}