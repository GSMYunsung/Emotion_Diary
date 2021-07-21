package com.example.emotiondiary.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Entitys::class],version = 1)
abstract class RoomAppDB : RoomDatabase()  {


    abstract fun userDao() : DAO?

    companion object{
        private var INSTANCEROOM : RoomAppDB? = null

        fun getAppDatabase(context: Context) : RoomAppDB?{
            if (INSTANCEROOM == null){
                INSTANCEROOM = Room.databaseBuilder(
                    context.applicationContext,RoomAppDB::class.java,"AppDB")
                    .allowMainThreadQueries()
                    .build()
            }
            return INSTANCEROOM
        }
    }
}