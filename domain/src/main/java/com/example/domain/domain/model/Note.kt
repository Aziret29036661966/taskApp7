package com.example.domain.domain.model

data class Note(
    val id: Int = DEFAULT_ID,
    val title: String? = null,
    val description: String? = null,
    val creationDate: String? = null
) {
    companion object{
        const val DEFAULT_ID = 0
    }
}
