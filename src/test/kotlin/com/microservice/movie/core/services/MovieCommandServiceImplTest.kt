package com.microservice.movie.core.services

import com.microservice.movie.core.interfaces.MovieCommandService
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.springframework.beans.factory.annotation.Autowired


class MovieCommandServiceImplTest
    @Autowired constructor(private val movieCommandService: MovieCommandService) {

    /*
    @Test
    fun `addCustomer should add a customer object to db and return true, customer not null and Success message`(){

        val customerDTO = buildCustomerDTO()

        val sut : ICustomerCommandService = CustomerCommandService(customerRepository)


        val result = sut.addCustomer(customerDTO)
        assertAll(
            { Assertions.assertTrue(result.second)},
            { Assertions.assertTrue(result.first !=null)},
            { Assertions.assertEquals("Success",result.third) }

        )
    }*/
}