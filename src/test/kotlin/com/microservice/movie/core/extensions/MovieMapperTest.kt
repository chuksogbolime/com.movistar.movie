package com.microservice.movie.core.extensions

import com.microservice.movie.common.buildSingleMovie
import com.microservice.movie.common.buildSingleMovieDto
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.springframework.core.env.Environment
import java.util.*


class MovieMapperTest {

    @Test
    fun `toMovieDTO extension on Movie should return MovieDTO object`(){
        //val env: Environment = System.get
        var envVar = System.getenv("mongodb_auth_database")
        var env = System.getenv("com_microservice_movie_kt_mongodb_port")
        var env2 = System.getenv("com_microservice_movie_kt_mongodb_database")
        val movie = buildSingleMovie()
        val result = movie.toMovieDto()
        assertAll(

            { Assertions.assertEquals(movie.title, result.title)},
            { Assertions.assertEquals(movie.description, result.description)},
            { Assertions.assertEquals(movie.id, result.id)},
            { Assertions.assertEquals(movie.category, result.category)},
            { Assertions.assertEquals(movie.releaseDate, result.releaseDate)},
            { Assertions.assertEquals(movie.director, result.director)},
            { Assertions.assertEquals(movie.producer, result.producer)},
            { Assertions.assertEquals(movie.country, result.country)},
            { Assertions.assertEquals(movie.leadFemale, result.leadFemale)},
            { Assertions.assertEquals(movie.leadMale, result.leadMale)},
            { Assertions.assertEquals(movie.owner, result.owner)}
        )

    }

    @Test
    fun `toMovie extension on MovieDto should return Movie object`(){
        val movie = buildSingleMovieDto()
        val result = movie.toMovie()
        assertAll(

            { Assertions.assertEquals(movie.title, result.title)},
            { Assertions.assertEquals(movie.description, result.description)},
            { Assertions.assertEquals(movie.id, result.id)},
            { Assertions.assertEquals(movie.category, result.category)},
            { Assertions.assertEquals(movie.releaseDate, result.releaseDate)},
            { Assertions.assertEquals(movie.director, result.director)},
            { Assertions.assertEquals(movie.producer, result.producer)},
            { Assertions.assertEquals(movie.country, result.country)},
            { Assertions.assertEquals(movie.leadFemale, result.leadFemale)},
            { Assertions.assertEquals(movie.leadMale, result.leadMale)},
            { Assertions.assertEquals(movie.owner, result.owner)}
        )

    }
}