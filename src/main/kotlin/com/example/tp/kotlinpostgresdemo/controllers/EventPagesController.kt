package com.example.tp.kotlinpostgresdemo.controllers

import com.example.tp.kotlinpostgresdemo.model.Attendee
import com.example.tp.kotlinpostgresdemo.model.Event
import com.example.tp.kotlinpostgresdemo.repos.AttendeeRepository
import com.example.tp.kotlinpostgresdemo.repos.EventRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.ModelMap
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@Controller
class EventPagesController {

    @Autowired
    lateinit var eventRepo: EventRepository

    @Autowired
    lateinit var attendeeRepo: AttendeeRepository

    @GetMapping("/NewEvent.html")
    fun createNewEventPage(model :Model): String
            = "NewEvent"

    @GetMapping("/EditEvents.html")
    fun editEventsPage(model :Model): String
            = "EditEvents"

    @PostMapping("/upsertEvent")
    fun upsertEvent(@RequestBody newEvent : Event)
            = eventRepo.save(newEvent)

    @PostMapping("/deleteEvent")
    fun deleteEvent(@RequestBody deleteEvent : Event)
            = eventRepo.delete(deleteEvent)

    @PostMapping("/upsertEventAttendee")
    fun upsertEventAttendee(@RequestBody eventAttendee : Attendee)
            = attendeeRepo.save(eventAttendee)

    @PostMapping("/deleteEventAttendee")
    fun deleteEventAttendee(@RequestBody deleteEventAttendee : Attendee)
            = attendeeRepo.delete(deleteEventAttendee)


}
