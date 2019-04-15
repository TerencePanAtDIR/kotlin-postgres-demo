package com.example.tp.kotlinpostgresdemo.model

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Organizer(@Id @GeneratedValue(strategy = GenerationType.AUTO)
                    var organizerId: Long = -1,
                    var organizerFirstName: String ?= "",
                    var organizerLastName: String ?= "",
                    var organizerMiddleName: String ?= "",
                    var organizerStreet: String ?= "",
                    var organizerStreet2: String ?= "",
                    var organizerCity: String ?= "",
                    var organizerState: String ?= "",
                    var organizerPostalCode: String ?= "",
                    var organizerCountry: String ?= "",
                    var organizerContactName: String ?= "",
                    var organizerContactPhone: String ?= "",
                    var organizerContactEmail: String ?= "",
                    var organizerComments: String ?= "",
                    var accountHasBeenActivated: Boolean = false,
                    var encryptedPassword: String ?= "")