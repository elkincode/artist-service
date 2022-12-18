package com.mirea.artistservice.repository

import com.mirea.artistservice.entity.Artist
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*


@Repository
interface ArtistRepository : JpaRepository<Artist?, UUID?> {
    fun findById(id: UUID?): Artist?
}