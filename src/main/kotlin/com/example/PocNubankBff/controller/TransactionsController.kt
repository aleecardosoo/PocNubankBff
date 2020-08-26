package com.example.PocNubankBff.controller

import com.example.PocNubankBff.service.TransactionsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

    @RestController
    class TransactionsController(
            private val transactionsService: TransactionsService
    ) {
        @GetMapping("/pagamento")
        fun getPaymentScreen() = transactionsService.createPaymentPage()

        @GetMapping("/poupanca")
        fun getTypesPoupancaScreen() = transactionsService.createTypesPoupancaPage()

        @GetMapping("/poupar")
        fun getPouparScreen() = transactionsService.createPouparPage()

        @GetMapping("/resgatar")
        fun getResgatarScreen() = transactionsService.createResgatarPage()

        @GetMapping("/deposito")
        fun getDepositoScreen() = transactionsService.createDepositoPage()

        @GetMapping("/saquecartao")
        fun getSaqueCartaoScreen() = transactionsService.createSaqueCartaoPage()

        @GetMapping("/userconf")
        fun getUserConfScreen() = transactionsService.createUserConfPage()

        @GetMapping("/listatransacoes")
        fun getListaTransacoesScreen() = transactionsService.createTransactionsListPage()

        @GetMapping("/realizapagamento/{valorPagamento}")
        fun recebePagamento(@PathVariable("valorPagamento") valorPagamento: String) {
            transactionsService.recebePagamento(valorPagamento)
        }

        @GetMapping("/poupar/{valorPoupar}")
        fun recebePoupar(@PathVariable("valorPoupar") valorPoupar: String) {
            transactionsService.recebePoupar(valorPoupar)
        }

        @GetMapping("/resgatar/{valorResgatar}")
        fun recebeResgatar(@PathVariable("valorResgatar") valorResgatar: String) {
            transactionsService.recebeResgatar(valorResgatar)
        }

        @GetMapping("/deposito/{valorDeposito}")
        fun recebeDeposito(@PathVariable("valorDeposito") valorDeposito: String) {
            transactionsService.recebeDeposito(valorDeposito)
        }

        @GetMapping("/saquecartao/{valorSaqueCartao}")
        fun recebeSaqueCartao(@PathVariable("valorSaqueCartao") valorSaqueCartao: String) {
            transactionsService.recebeSaqueCartao(valorSaqueCartao)
        }

        @GetMapping("/userconf/{userName}")
        fun changeName(@PathVariable("userName") userName: String) {
            transactionsService.userChangeName(userName)
        }
    }
