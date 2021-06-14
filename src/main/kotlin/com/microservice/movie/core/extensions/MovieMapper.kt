package com.microservice.movie.core.extensions

import com.microservice.movie.core.entities.Movie
import com.microservice.movie.core.models.api.requests.MovieApiRequest
import com.microservice.movie.core.models.dtos.MovieDto
import com.microservice.movie.core.models.dtos.MovieMessageDto
import org.springframework.data.annotation.CreatedDate
import java.util.*

fun Movie.toMovieDto() = MovieDto(
    title=title,
    description=description,
    category=category,
    releaseDate = releaseDate,
    director=director,
    producer = producer,
    country = country,
    leadMale = leadMale,
    leadFemale = leadFemale,
    owner = owner,
    id=id,
    createdBy=createdBy,
    createdDate=createdDate,
    modifiedBy=modifiedBy,
    modifiedDate=modifiedDate,
    deleteFlag=deleteFlag
)

fun MovieDto.toMovie() = Movie(
    title=title,
    description=description,
    category=category,
    releaseDate = releaseDate,
    director=director,
    producer = producer,
    country = country,
    leadMale = leadMale,
    leadFemale = leadFemale,
    owner = owner,
    id=id,
    createdBy=createdBy,
    createdDate=createdDate,
    modifiedBy=modifiedBy,
    modifiedDate=modifiedDate,
    deleteFlag=deleteFlag
)

fun MovieApiRequest.toMovieDto(createdDate: Date,modifiedBy:String?=null, modifiedDate:Date?=null, deleteFlag:Boolean=false) = MovieDto(
    title=title,
    description=description,
    category=category,
    releaseDate = releaseDate,
    director=director,
    producer = producer,
    country = country,
    leadMale = leadMale,
    leadFemale = leadFemale,
    owner = owner,
    createdBy=createdBy,
    createdDate = Date(),
    modifiedBy=modifiedBy,
    modifiedDate=modifiedDate,
    deleteFlag=deleteFlag
)

fun Movie.toMovieMessageDto() = MovieMessageDto(
    id=id!!,
    title=title
)