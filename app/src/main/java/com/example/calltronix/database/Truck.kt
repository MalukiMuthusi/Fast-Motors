package com.example.calltronix.database

import androidx.room.Entity

@Entity
data class Truck(
    var ID: Long,
    var model: String,
    var regNumber: Int,
    var chassisNumber: Int,
    var engineNumber: Int,
    var carMileage: Int,
    var parts: List<Part_n>
) {

}
