package com.microservice.movie.core.models.dtos

import com.microservice.movie.core.interfaces.ObjectSerializerService
import org.springframework.beans.factory.annotation.Autowired

data class MovieMessageDto (val id:String, val title:String){


}