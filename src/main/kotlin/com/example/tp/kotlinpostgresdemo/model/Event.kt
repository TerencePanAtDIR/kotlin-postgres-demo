package com.example.tp.kotlinpostgresdemo.model

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Event(@Id @GeneratedValue(strategy = GenerationType.AUTO)
                 var eventId: Long = -1,
                 var eventName: String ?= "",
                 var eventStartDateTime: LocalDateTime = LocalDateTime.now(),
                 var eventEndDateTime: LocalDateTime = LocalDateTime.now())
                 //val organizer: Organizer,
                 //val attendees: List<Attendee>,
                 //val eventLocation: EventLocation)
