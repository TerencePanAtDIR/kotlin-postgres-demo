package com.example.tp.kotlinpostgresdemo.model

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


data class EventLocation(@Id @GeneratedValue(strategy = GenerationType.AUTO)
                         val locationId: Long,
                         val locationName: String,
                         val locationStreet: String,
                         val locationStreet2: String,
                         val locationCity: String,
                         val locationState: String,
                         val locationPostalCode: String,
                         val locationCountry: String,
                         val locationCoordinates: String,
                         val locationContactName: String,
                         val locationContactPhone: String,
                         val locationContactEmail: String,
                         val locationComments: String)
