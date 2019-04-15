package com.example.tp.kotlinpostgresdemo.model

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Attendee(@Id @GeneratedValue(strategy = GenerationType.AUTO)
                    var attendeeId: Long,
                    var attendeeFirstName: String ?= "",
                    var attendeeLastName: LocalDateTime,
                    var attendeeMiddleName: String ?= "",
                    var attendeeStreet: String ?= "",
                    var attendeeStreet2: String ?= "",
                    var attendeeCity: String ?= "",
                    var attendeeState: String ?= "",
                    var attendeePostalCode: String ?= "",
                    var attendeeCountry: String ?= "",
                    var attendeeContactName: String ?= "",
                    var attendeeContactPhone: String ?= "",
                    var attendeeContactEmail: String ?= "",
                    var attendeeRsvpSent: Boolean,
                    var attendeeRsvpSentDate: Boolean,
                    var attendeeComments: String ?= "")