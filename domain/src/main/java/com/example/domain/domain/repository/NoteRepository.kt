package com.example.domain.domain.repository

import com.example.core.Resource
import com.example.domain.domain.model.Note
import kotlinx.coroutines.flow.Flow


interface NoteRepository {

    fun addNote(note: Note): Flow<Resource<Unit>>

    fun getAllNotes(): Flow<Resource<List<Note>>>

    fun deleteNote(note: Note) : Flow<Resource<Unit>>

    fun editNote(id: Int, note: Note) : Flow<Resource<Unit>>

}