package com.example.tp.kotlinpostgresdemo.model

import java.time.LocalDateTime
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class Attendee(@Id @GeneratedValue(strategy = GenerationType.AUTO)
                    val attendeeId: Long,
                    val attendeeFirstName: String,
                    val attendeeLastName: LocalDateTime,
                    val attendeeMiddleName: String,
                    val attendeeStreet: String,
                    val attendeeStreet2: String,
                    val attendeeCity: String,
                    val attendeeState: String,
                    val attendeePostalCode: String,
                    val attendeeCountry: String,
                    val attendeeContactName: String,
                    val attendeeContactPhone: String,
                    val attendeeContactEmail: String,
                    val attendeeRsvpSent: Boolean,
                    val attendeeRsvpSentDate: Boolean,
                    val attendeeComments: String)