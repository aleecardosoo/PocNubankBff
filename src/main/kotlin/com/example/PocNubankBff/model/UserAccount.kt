package com.example.PocNubankBff.model

import com.example.PocNubankBff.home.objects.LastTransaction
import java.text.SimpleDateFormat
import java.util.*


object UserAccount {

    var name: String = ""
        get() = field
        set(value) {
            field = value
        }

    var money: Double = 100.00
    get() = field
        set(value) {
        field = value
    }

    var poupanca: Double = 0.00
        get() = field
        set(value) {
            field = value
        }

    var fatura: Double = 0.00
        get() = field
        set(value) {
            field = value
        }

    var limite: Double = 5000.00
        get() = field
        set(value) {
            field = value
        }

    var points: Int = 0
        get() = field
        set(value) {
            field = value
        }

    var valueLastTransation: Double = 00.0
        get() = field
        set(value) {
            field = value
        }

    var lastTransationType: String = ""
        get() = field
        set(value) {
            field = value
        }

    fun havePoints(): String {
        if (points == 0) {
            return "Realize transações para ganhar pontos"
        } else {
            return "pontos"
        }
    }

    fun havePointsTitle(): String{
        if (points == 0){
            return ""
        }else{
            return "Você tem"
        }
    }

    fun lastTransationMessage(): String {

        if (lastTransationType != "") {
            val sdf = SimpleDateFormat("dd/M")
            val currentDate = sdf.format(Date())
            return lastTransationType + " no valor de R$ " + valueLastTransation + " no dia " + currentDate
        } else return ""
    }
}