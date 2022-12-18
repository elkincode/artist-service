package com.mirea.artistservice.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
data class Artist(
    @Id
    val id: UUID?,
    val artistName: String,
    val artistSurname: String,
    val artistCountry: String
)