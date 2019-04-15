package com.example.tp.kotlinpostgresdemo.repos

import com.example.tp.kotlinpostgresdemo.model.Event
import com.example.tp.kotlinpostgresdemo.model.Organizer
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface OrganizerRepository : CrudRepository<Organizer, Long> {
    fun findByOrganizerId(organizerId: Long): Iterable<Organizer>
}