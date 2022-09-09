package com.example.data.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.data.data.model.NoteEntity
import com.example.data.data.room.NoteDao

@Database(entities = [NoteEntity::class], version = 1)
abstract class NoteDataBase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}