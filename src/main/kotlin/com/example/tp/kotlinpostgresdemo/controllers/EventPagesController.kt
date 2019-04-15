package com.example.tp.kotlinpostgresdemo.controllers

import com.example.tp.kotlinpostgresdemo.encryptPassword
import com.example.tp.kotlinpostgresdemo.model.Attendee
import com.example.tp.kotlinpostgresdemo.model.Event
import com.example.tp.kotlinpostgresdemo.model.Organizer
import com.example.tp.kotlinpostgresdemo.repos.AttendeeRepository
import com.example.tp.kotlinpostgresdemo.repos.EventRepository
import com.example.tp.kotlinpostgresdemo.repos.OrganizerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@RestController
class EventPagesController {

    @Autowired
    lateinit var eventRepo: EventRepository

    @Autowired
    lateinit var attendeeRepo: AttendeeRepository

    @Autowired
    lateinit var organizerRepo: OrganizerRepository

    @GetMapping("/CreateNewEvent")
    fun createNewEventPage(model : Model): String {
        val event = Event()
        model.addAttribute(event)
        return "NewEvent"
    }

    @GetMapping("/Register")
    fun createNewOrganizerPage(model : Model): String {
        var organizer = Organizer()
        model.addAttribute(organizer)
        return "NewOrganizer"
    }

    @PostMapping("/RegisterPost")
    fun registerNewOrganizer(@ModelAttribute("organizer") organizer : Organizer):String {
        System.out.println(organizer.encryptedPassword)
        organizer.encryptedPassword = encryptPassword(organizer.encryptedPassword.toString())
        System.out.println(organizer.encryptedPassword)
        organizerRepo.save(organizer)

        return "success"
    }
/*
    @RequestMapping("/EditEvents")
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
            = attendeeRepo.delete(deleteEventAttendee)*/


}
