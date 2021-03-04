package br.senai.sp.jandira.roomtest.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate


@Entity
data class Contato (
    @PrimaryKey(autoGenerate = true) var id: Int,

    @ColumnInfo (name = "nome")
    var nomeContato: String,

    @ColumnInfo (name = "telefone")
    var telefoneContato: String?
)
