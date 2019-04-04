package com.example.tp.kotlinpostgresdemo.model

import java.time.LocalDateTime
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class Event(@Id @GeneratedValue(strategy = GenerationType.AUTO)
                 val eventId: Long,
                 val eventName: String,
                 val eventStartDateTime: LocalDateTime,
                 val eventEndDateTime: LocalDateTime,
                 val organizer: Organizer,
                 val attendees: List<Attendee>,
                 val eventLocation: EventLocation)
