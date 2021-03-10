package io.github.wesleyosantos91.controller

import io.github.wesleyosantos91.domain.person.Person
import io.github.wesleyosantos91.producer.Producer
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import java.util.*
import javax.inject.Singleton

@Singleton
@Controller("/api/events")
class EventController(private val produce: Producer) {

    @Post("/publish")
    fun publish(person: Person) {
        produce.sendMessage(UUID.randomUUID().toString(), person);
    }
}