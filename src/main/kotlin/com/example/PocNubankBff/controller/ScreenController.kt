package com.example.PocNubankBff.controller


import com.example.PocNubankBff.service.ScreenBeagleService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ScreenController(
        private val screenBeagleService: ScreenBeagleService
) {
    @GetMapping("/")
    fun getFirstScreen() = screenBeagleService.createScreenBeagle()
}