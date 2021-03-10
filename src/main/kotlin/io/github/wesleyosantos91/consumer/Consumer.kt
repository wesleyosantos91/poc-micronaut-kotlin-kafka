package io.github.wesleyosantos91.consumer

import io.github.wesleyosantos91.domain.person.Person
import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.KafkaListener
import io.micronaut.configuration.kafka.annotation.Topic
import io.micronaut.messaging.annotation.Body
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.inject.Singleton

@Singleton
@KafkaListener(groupId = "wos")
class Consumer {


    val LOGGER: Logger = LoggerFactory.getLogger(Consumer::class.java.name)

    @Topic("persons")
    fun receive(@KafkaKey id: String, @Body person: Person) {
        LOGGER.info("Received: {}", person);
    }
}