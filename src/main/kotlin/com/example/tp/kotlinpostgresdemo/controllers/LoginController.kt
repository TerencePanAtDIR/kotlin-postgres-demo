package com.example.tp.kotlinpostgresdemo.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PostMapping

@Controller
class LoginController{

    @PostMapping("/LoginPage.html")
    fun loginToApp(model : Model): String
            = "LoginPage"

}