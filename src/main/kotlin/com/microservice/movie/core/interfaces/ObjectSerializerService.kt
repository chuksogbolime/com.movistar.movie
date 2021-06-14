package com.microservice.movie.core.interfaces

interface ObjectSerializerService {
    fun <T> serialize(t:T):String
}