package com.microservice.movie.core.services

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.microservice.movie.core.interfaces.ObjectSerializerService
import org.springframework.stereotype.Service

@Service
class JacksonObjectSerializerService:ObjectSerializerService {
    override fun <T> serialize(t:T):String{
        val mapper = jacksonObjectMapper()
        return mapper.writeValueAsString(t)
    }
}

