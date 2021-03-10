package io.github.wesleyosantos91.producer

import io.github.wesleyosantos91.domain.person.Person
import io.micronaut.configuration.kafka.annotation.KafkaClient
import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.Topic
import io.micronaut.context.annotation.Factory
import io.micronaut.messaging.annotation.Body
import javax.inject.Singleton

@Factory
@KafkaClient
interface Producer {

    @Topic("persons")
    fun sendMessage(@KafkaKey id: String, @Body person: Person)
}