package br.senai.sp.jandira.roomtest.dao

import androidx.room.*
import br.senai.sp.jandira.roomtest.model.Contato

@Dao
interface ContatoDao {
    @Insert
    fun salvar(contato: Contato)

    @Update
    fun atualizaContato (contato:Contato)

    @Query ("SELECT * FROM contato ORDER BY id ASC")
    fun ListarTodos (): List<Contato>

    @Query ("SELECT * FROM contato WHERE id = :id")
    fun ListarPorId(id: Int): Contato

    @Delete
    fun excluir(contato: Contato)
}