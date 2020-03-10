package com.example.calltronix.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Driver(
    @PrimaryKey(autoGenerate = true)
    var Id: Long = 0L,
    var name: String,
    var phoneNumber: Int,
    var companyName: String,
    var ownerEmail: String,
    var truck: Truck
) {
}