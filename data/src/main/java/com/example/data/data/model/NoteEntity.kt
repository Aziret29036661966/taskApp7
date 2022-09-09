package com.example.data.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "note_db")
data class NoteEntity(

    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String? = null,
    val description: String? = null,
    val creationDate: String? = null
)
