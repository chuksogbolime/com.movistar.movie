package com.microservice.movie.common

import com.microservice.movie.core.entities.Movie
import com.microservice.movie.core.models.dtos.MovieDto
import java.util.*

fun buildSingleMovie() = Movie(
    title="Rich Boys",
    description="Home made film",
    category="Action",
    releaseDate = Date(),
    director="Sam James",
    producer = "John Woo",
    country = "Nigeria",
    leadMale = "Richard King",
    leadFemale = "Ada Williams",
    owner = "Movie Star",
    id="5fcba07c30e3af4497f5de17",
    createdBy="tester@test.com",
    createdDate = Date(),
    modifiedBy= "tester@test.com",
    modifiedDate =Date(),
    deleteFlag=false
)

fun buildSingleMovieDto() = MovieDto(
    title="Rich Boys",
    description="Home made film",
    category="Action",
    releaseDate = Date(),
    director="Sam James",
    producer = "John Woo",
    country = "Nigeria",
    leadMale = "Richard King",
    leadFemale = "Ada Williams",
    owner = "Movie Star",
    id="5fcba07c30e3af4497f5de17",
    createdBy="tester@test.com",
    createdDate = Date(),
    modifiedBy= "tester@test.com",
    modifiedDate =Date(),
    deleteFlag=false
)