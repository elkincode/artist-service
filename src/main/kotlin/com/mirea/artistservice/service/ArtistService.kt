package com.mirea.artistservice.service

import com.mirea.artistservice.entity.Artist
import com.mirea.artistservice.repository.ArtistRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class ArtistService(
    private val artistRepository: ArtistRepository
) {
    fun saveArtist(artist: Artist): Artist {
        return artistRepository.save(artist)
    }

    fun findArtistById(artistId: UUID?): Artist? {
        return artistRepository.findById(artistId)
    }
}