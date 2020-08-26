package com.example.PocNubankBff.service

import com.example.PocNubankBff.home.builder.ScreenBeagleBuilder
import org.springframework.stereotype.Service

@Service
class ScreenBeagleService {
    fun createScreenBeagle() = ScreenBeagleBuilder
}