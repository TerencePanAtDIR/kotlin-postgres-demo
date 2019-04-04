package com.example.tp.kotlinpostgresdemo.controllers

import com.example.tp.kotlinpostgresdemo.model.Event
import com.example.tp.kotlinpostgresdemo.repos.AttendeeRepository
import com.example.tp.kotlinpostgresdemo.repos.EventRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ui.ModelMap
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
class EventRestController {

    @Autowired
    lateinit var eventRepo: EventRepository

    @Autowired
    lateinit var attendeeRepo: AttendeeRepository

    @GetMapping("/findByEventName")
    fun findEventByEventName(@PathVariable eventName: String) = eventRepo.findByEventName(eventName)

    //add html response
    @PostMapping("/addEvent")
    fun submitNewEvent(@Valid @ModelAttribute("event") event: Event,
                       result: BindingResult, model: ModelMap): String {

        eventRepo.save(event)

        if (!result.hasErrors()) {
            return "failed"
        }

        return "success"

    }
}