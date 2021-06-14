package com.microservice.movie.core.models.api.requests

import java.util.*

class MovieApiRequest (
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
    val createdBy: String
)