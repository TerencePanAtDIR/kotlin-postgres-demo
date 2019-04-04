package com.example.tp.kotlinpostgresdemo.repos

import com.example.tp.kotlinpostgresdemo.model.Attendee
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository


@Repository
interface AttendeeRepository : CrudRepository<Attendee, Long> {
    fun findByAttendeeFirstNameAndAttendeeLastName(attendeeFirstName: String, attendeeLastName: String): Iterable<Attendee>

}