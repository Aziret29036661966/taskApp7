package com.example.data.data.mapper

import com.example.data.data.model.NoteEntity
import com.example.domain.domain.model.Note

class NoteMapper {

    fun noteToNoteEntity(note: Note) = NoteEntity(
        id= note.id,
        title = note.title,
        description = note.description,
        creationDate = note.creationDate
    )

    fun noteEntityToNote(note: NoteEntity) = Note(
        id= note.id,
        title = note.title,
        description = note.description,
        creationDate = note.creationDate
    )
}