package br.senai.sp.jandira.roomtest.dao

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

class Database {

    companion object{
        fun getDatabase(context: Context) : AppDataBase{
             return Room.databaseBuilder(context, AppDataBase :: class.java, "db_contato").allowMainThreadQueries().build()
        }
    }
}