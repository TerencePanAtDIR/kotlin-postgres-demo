package com.example.tp.kotlinpostgresdemo.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class EventLocation(@Id @GeneratedValue(strategy = GenerationType.AUTO)
                         var locationId: Long,
                         var locationName: String ?= "",
                         var locationStreet: String ?= "",
                         var locationStreet2: String ?= "",
                         var locationCity: String ?= "",
                         var locationState: String ?= "",
                         var locationPostalCode: String ?= "",
                         var locationCountry: String ?= "",
                         var locationCoordinates: String ?= "",
                         var locationContactName: String ?= "",
                         var locationContactPhone: String ?= "",
                         var locationContactEmail: String ?= "",
                         var locationComments: String ?= "")
