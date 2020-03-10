package com.example.calltronix.database

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface FastMotorsDatabaseDao {

    @Insert
    fun insert(driver: Driver)
}