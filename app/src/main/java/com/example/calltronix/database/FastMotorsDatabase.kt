package com.example.calltronix.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Driver::class, Truck::class, Part_n::class],
    version = 1,
    exportSchema = false
)
abstract class FastMotorsDatabase : RoomDatabase() {
    abstract val fastMotorsDatabaseDao: FastMotorsDatabaseDao

    companion object {
        @Volatile
        private var INSTANCE: FastMotorsDatabase? = null

        fun getInstance(context: Context): FastMotorsDatabase {
            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        FastMotorsDatabase::class.java,
                        "sleep_history_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}