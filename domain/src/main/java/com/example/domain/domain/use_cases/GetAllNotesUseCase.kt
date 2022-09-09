package com.example.domain.domain.use_cases

import com.example.domain.domain.repository.NoteRepository
import javax.inject.Inject

class GetAllNotesUseCase @Inject constructor(private val repo: NoteRepository) {

    fun getAllNotes() = repo.getAllNotes()
}