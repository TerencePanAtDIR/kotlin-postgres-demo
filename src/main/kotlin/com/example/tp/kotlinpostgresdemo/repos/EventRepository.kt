package com.example.tp.kotlinpostgresdemo.repos

import com.example.tp.kotlinpostgresdemo.model.Event
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface EventRepository : CrudRepository<Event, Long> {
    fun findByEventName(eventName: String): Iterable<Event>
}