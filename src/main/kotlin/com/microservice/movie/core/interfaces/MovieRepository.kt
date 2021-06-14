package com.microservice.movie.core.interfaces

import com.microservice.movie.core.entities.Movie
import org.springframework.data.mongodb.repository.MongoRepository

interface MovieRepository :MongoRepository<Movie, String>