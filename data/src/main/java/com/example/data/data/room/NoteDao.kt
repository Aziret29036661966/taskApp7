package com.example.data.data.room

import androidx.room.*
import com.example.data.data.model.NoteEntity

@Dao
interface NoteDao {

    @Query("SELECT * FROM note_db")
    suspend fun getAllNotes() : List<NoteEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addNote(noteEntity: NoteEntity)

    @Delete
    suspend fun deleteNote(noteEntity: NoteEntity)

    @Update
    suspend fun editNote(noteEntity: NoteEntity)
}