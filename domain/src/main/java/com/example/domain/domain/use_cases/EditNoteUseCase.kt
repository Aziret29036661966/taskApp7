package com.example.domain.domain.use_cases

import com.example.domain.domain.model.Note
import com.example.domain.domain.repository.NoteRepository
import javax.inject.Inject

class EditNoteUseCase @Inject constructor(private val repo: NoteRepository) {

    fun editNote(id: Int, note: Note) = repo.editNote(id, note)
}