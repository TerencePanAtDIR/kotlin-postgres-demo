package com.example.tp.kotlinpostgresdemo.model

import java.time.LocalDateTime
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class Organizer(@Id @GeneratedValue(strategy = GenerationType.AUTO)
                    val organizerId: Long,
                    val organizerFirstName: String,
                    val organizerLastName: LocalDateTime,
                    val organizerMiddleName: String,
                    val organizerStreet: String,
                    val organizerStreet2: String,
                    val organizerCity: String,
                    val organizerState: String,
                    val organizerPostalCode: String,
                    val organizerCountry: String,
                    val organizerContactName: String,
                    val organizerContactPhone: String,
                    val organizerContactEmail: String,
                    val organizerComments: String)