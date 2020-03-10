package com.example.calltronix.database

import androidx.room.Entity

@Entity
data class Part_n(
    var ID: Long,
    var name: String,
    var price: Int,
    var partNumber: String,
    var needsService: Boolean
) {

}
