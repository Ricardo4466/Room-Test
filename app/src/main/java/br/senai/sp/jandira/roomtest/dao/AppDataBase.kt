package br.senai.sp.jandira.roomtest.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import br.senai.sp.jandira.roomtest.model.Contato

@Database(entities = [Contato::class], version = 1)
abstract class AppDataBase : RoomDatabase(){

    abstract fun ContatoDao(): ContatoDao
}