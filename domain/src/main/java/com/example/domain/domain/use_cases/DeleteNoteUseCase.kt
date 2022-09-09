package com.example.domain.domain.use_cases

import com.example.domain.domain.model.Note
import com.example.domain.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteNoteUseCase @Inject constructor(private val repo: NoteRepository) {

    fun deleteNote(note: Note) = repo.deleteNote(note)
}