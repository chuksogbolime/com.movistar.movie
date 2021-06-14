package com.microservice.movie.core.models.dtos

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import java.util.*

data class MovieDto (
    val title : String,
    val description : String,
    val category : String,
    val releaseDate : Date,
    val director : String,
    val producer : String,
    val country : String,
    val leadMale : String,
    val leadFemale : String,
    val owner :String,
    val id:String?=null,
    val createdBy: String,
    val createdDate: Date,
    val modifiedBy: String?,
    val modifiedDate: Date?,
    val deleteFlag:Boolean
        )