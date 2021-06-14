package com.microservice.movie.core.services

import com.microservice.movie.core.extensions.toMovie
import com.microservice.movie.core.extensions.toMovieDto
import com.microservice.movie.core.extensions.toMovieMessageDto
import com.microservice.movie.core.interfaces.EventBrokerService
import com.microservice.movie.core.interfaces.MovieCommandService
import com.microservice.movie.core.interfaces.MovieRepository
import com.microservice.movie.core.interfaces.ObjectSerializerService
import com.microservice.movie.core.models.dtos.MovieDto
import org.springframework.stereotype.Service
import java.lang.Exception

@Service
class MovieCommandServiceImpl(private val movieRepository: MovieRepository,
                                private val brokerService: EventBrokerService
                                ,private val serializer: ObjectSerializerService
) : MovieCommandService {
    override fun  add(movieDto: MovieDto): Triple<MovieDto?,Boolean,String>{
        return try{
            val saveResult=movieRepository.save(movieDto.toMovie())
            if(saveResult !=null){
                //publish to event broker service
                val message = serializer.serialize(saveResult.toMovieMessageDto())

                val publishResult = brokerService.publish(message)
                if(publishResult.first){
                    return Triple(saveResult.toMovieDto(), true, "Movie saved and published successfully")
                }
                Triple(saveResult.toMovieDto(), true, "Movie saved successfully")
            }
            Triple(null, false, "Movie could not be saved")
        }catch (ex:Exception){
            Triple(null, false,ex.toString())
        }
    }
    override fun update(id:Long, movieDto: MovieDto): Triple<MovieDto?,Boolean,String>{
        return  Triple(null, false,"Not implemented")
    }
    override fun delete(id: Long):Pair<Boolean, String>{
        return Pair(false, "Not implemented")
    }
}