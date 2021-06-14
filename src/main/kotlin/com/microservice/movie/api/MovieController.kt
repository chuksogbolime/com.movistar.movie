package com.microservice.movie.api

import com.microservice.movie.core.extensions.toMovieDto
import com.microservice.movie.core.interfaces.MovieCommandService
import com.microservice.movie.core.models.api.requests.MovieApiRequest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import java.net.URI
import java.util.*

@RestController
@RequestMapping("/api/movie")
@CrossOrigin(allowCredentials = "false")
class MovieController(private val movieCommandService: MovieCommandService) {


    val rootLink = "/api/movie"

    @PostMapping
    fun addCustomer(@RequestBody movie: MovieApiRequest): ResponseEntity<Any> {
        val result=movieCommandService.add(movie.toMovieDto(Date()))

        return if(result.second){
            val urlString = "$rootLink/${result.first?.id}"
            ResponseEntity.created(URI.create(urlString)).body(result.first!!)
        }
        else
            ResponseEntity.badRequest().body(null)
    }
}