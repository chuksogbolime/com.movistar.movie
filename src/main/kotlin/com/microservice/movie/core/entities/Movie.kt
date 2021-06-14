package com.microservice.movie.core.entities

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document("movie")
data class Movie (
    @Id
    val id:String?=null,
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
    val createdBy: String,
    val createdDate: Date,
    val modifiedBy: String?,
    val modifiedDate: Date?,
    val deleteFlag:Boolean

)