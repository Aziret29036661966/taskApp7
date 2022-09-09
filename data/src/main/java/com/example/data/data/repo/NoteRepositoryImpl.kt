package com.example.data.data.repo

import com.example.core.BaseRepository
import com.example.core.Resource
import com.example.data.data.mapper.NoteMapper
import com.example.data.data.room.NoteDao
import com.example.domain.domain.model.Note
import com.example.domain.domain.repository.NoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val noteDao: NoteDao
): NoteRepository, BaseRepository() {

//DRY - don't repeat yourself
    private val noteMapper = NoteMapper()

    override fun addNote(note: Note): Flow<Resource<Unit>> = doRequest {
        noteDao.addNote(noteMapper.noteToNoteEntity(note))
    }

    override fun getAllNotes(): Flow<Resource<List<Note>>> = doRequest {
        noteDao.getAllNotes().map { noteEntity -> noteMapper.noteEntityToNote(noteEntity) }
    }

    override fun deleteNote(note: Note): Flow<Resource<Unit>> = doRequest {
        noteDao.deleteNote(noteMapper.noteToNoteEntity(note))
    }

    override fun editNote(id: Int, note: Note): Flow<Resource<Unit>> = doRequest {
        noteDao.editNote(noteMapper.noteToNoteEntity(note))
    }
}