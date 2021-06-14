package com.microservice.movie.core.interfaces

interface EventBrokerService {
    fun publish(message:String) : Pair<Boolean, String>
}