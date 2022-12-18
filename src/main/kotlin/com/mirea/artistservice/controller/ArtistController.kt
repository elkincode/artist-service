package com.mirea.artistservice.controller

import com.mirea.artistservice.entity.Artist
import com.mirea.artistservice.service.ArtistService

import org.springframework.web.bind.annotation.*
import java.util.*


@RestController
@RequestMapping("/artist")
class ArtistController(
        private val artistService: ArtistService,

        ) {

    @PostMapping("/")
    fun saveArtist(@RequestParam name: String, surname: String, country: String): Artist {
        return artistService.saveArtist(
            Artist(
                id = UUID.randomUUID(),
                artistName = name,
                artistSurname = surname,
                artistCountry = country
            )
        )
    }

    @GetMapping("/{id}")
    fun findArtistById(@PathVariable("id") artistId: String): Artist? {
        return artistService.findArtistById(UUID.fromString(artistId))
    }

    @GetMapping ("/__health/")
    fun  checkHealth():Boolean{
        return true
    }
}

