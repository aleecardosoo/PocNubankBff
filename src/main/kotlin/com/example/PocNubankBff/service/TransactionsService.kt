package com.example.PocNubankBff.service

import com.example.PocNubankBff.data.TransactionObject
import com.example.PocNubankBff.data.TransactionRepository
import com.example.PocNubankBff.data.transacoes
import com.example.PocNubankBff.home.builder.*
import com.example.PocNubankBff.model.UserAccount
import org.springframework.stereotype.Service
import java.lang.Exception

@Service
class TransactionsService {
    fun createPaymentPage() = PaymentPage

    fun createTypesPoupancaPage() = TypesPoupancaPage

    fun createPouparPage() = PouparPage

    fun createResgatarPage() = ResgatarPage

    fun createDepositoPage() = DepositoPage

    fun createSaqueCartaoPage() = SaqueCartãoPage

    fun createUserConfPage() = UserConfPage

    fun createTransactionsListPage() = ListaTransacoesPage

    fun userChangeName(name: String){
        UserAccount.name = name
    }

    fun recebePagamento(valor: String) {
        val doubleValor = valor.toDouble()

        try {
            if (doubleValor <= UserAccount.money) {
                UserAccount.money -= doubleValor
                UserAccount.points += 1
                UserAccount.valueLastTransation = doubleValor
                UserAccount.lastTransationType = "Pagamento"

                transacoes.add(TransactionObject("Pagamento", doubleValor))
            }
        } catch (e: Exception) {

        }
    }

    fun recebePoupar(valor: String) {
        val doubleValor = valor.toDouble()

        try {
            if (doubleValor <= UserAccount.money) {
                UserAccount.money -= doubleValor
                UserAccount.poupanca += doubleValor
                UserAccount.points += 1
                UserAccount.valueLastTransation = doubleValor
                UserAccount.lastTransationType = "Depósito na poupança"

                transacoes.add(TransactionObject("Depósito na poupança", doubleValor))
            }
        } catch (e: Exception) {

        }
    }

    fun recebeResgatar(valor: String) {
        val doubleValor = valor.toDouble()

        try {
            if (doubleValor <= UserAccount.money) {
                UserAccount.money += doubleValor
                UserAccount.poupanca -= doubleValor
                UserAccount.points += 1
                UserAccount.valueLastTransation = doubleValor
                UserAccount.lastTransationType = "Resgate da poupança"

                transacoes.add(TransactionObject("Resgate da poupança", doubleValor))
            }
        } catch (e: Exception) {

        }
    }

    fun recebeDeposito(valor: String) {
        val doubleValor = valor.toDouble()

        try {
            UserAccount.money += doubleValor
            UserAccount.points += 1
            UserAccount.valueLastTransation = doubleValor
            UserAccount.lastTransationType = "Depósito"

            transacoes.add(TransactionObject("Depósito", doubleValor))
        } catch (e: Exception) {

        }
    }

    fun recebeSaqueCartao(valor: String) {
        val doubleValor = valor.toDouble()

        try {
            UserAccount.money += doubleValor
            UserAccount.fatura += doubleValor
            UserAccount.limite -= doubleValor
            UserAccount.points += 1
            UserAccount.valueLastTransation = doubleValor
            UserAccount.lastTransationType = "Saque do cartão"

            transacoes.add(TransactionObject("Saque do cartão", doubleValor))
        } catch (e: Exception) {

        }
    }

}
