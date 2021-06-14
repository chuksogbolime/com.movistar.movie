package com.microservice.movie.core.interfaces

import com.microservice.movie.core.models.dtos.MovieDto

interface MovieCommandService {
    fun add(movieDto: MovieDto): Triple<MovieDto?,Boolean,String>

    fun update(id:Long, movieDto: MovieDto): Triple<MovieDto?,Boolean,String>
    fun delete(id: Long):Pair<Boolean, String>
}