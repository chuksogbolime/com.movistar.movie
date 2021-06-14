package com.microservice.movie.core.services


import com.microservice.movie.core.interfaces.EventBrokerService
import com.rabbitmq.client.Channel
import com.rabbitmq.client.Connection
import com.rabbitmq.client.ConnectionFactory
import org.springframework.stereotype.Service
import java.lang.Exception

@Service
class RabbitMQEventBrokerService : EventBrokerService {
    private val connectionFactory = ConnectionFactory()
    private val exchangeName:String
    private val routingKey:String
    private val queueName:String
    init {
        connectionFactory.host="localhost"
        connectionFactory.port=5672
        connectionFactory.virtualHost="/"
        connectionFactory.username="guest"
        connectionFactory.password="guest"
        exchangeName="Movies"
        routingKey="moviesKey"
        queueName="movie.post.new.service"
        setDefaultExchange()
    }

    private fun setDefaultExchange(){
        try{
            val connection = connectionFactory.newConnection()
            val channel:Channel = connection.createChannel()
            channel.exchangeDeclare(exchangeName,"direct", true )
            channel.queueDeclare(queueName, true, false, false, null)
            channel.queueBind(queueName,exchangeName,routingKey)
            closeConnection(channel,connection)
        }catch(e:Exception) {
            //logger
            throw e
        }


    }
    private fun closeConnection( channel:Channel, connection:Connection){
        channel.close()
        connection.close()
    }

    override fun publish(message: String): Pair<Boolean, String> {
        return try {
            val connection = connectionFactory.newConnection()
            val channel = connection.createChannel()
            channel.basicPublish(exchangeName, routingKey, null,
                message.toByteArray())
            closeConnection(channel,connection)
            Pair(true,"Successfully published to broker service")
        }catch (e:Exception){
            Pair(false,e.toString())
        }

    }
}