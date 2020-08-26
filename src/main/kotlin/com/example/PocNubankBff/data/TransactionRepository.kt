package com.example.PocNubankBff.data

import br.com.zup.beagle.core.ServerDrivenComponent
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.ui.Image
import br.com.zup.beagle.widget.ui.ImagePath
import br.com.zup.beagle.widget.ui.Text
import com.example.PocNubankBff.model.UserAccount
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

private val sdf = SimpleDateFormat("dd/M")
private val currentDate = sdf.format(Date())

var transacoes: MutableList<TransactionObject> = ArrayList()

class TransactionRepository() {

    
    fun constroiTransacaoCard(tipo: String, valor: Double): ServerDrivenComponent =
            Container(
                    listOf(
                            Image(path = ImagePath.Local.justMobile(mobileId = "transactionsBlack")).applyStyle(Style(size = Size(height = 60.unitReal(), width = 60.unitReal()), margin = EdgeValue(right = 15.unitReal()))),
                            Text(text = tipo + " no valor de R$ " + valor + " no dia " + currentDate, styleId = "smallblack").applyFlex(flex = Flex(alignSelf = AlignSelf.CENTER))
                    )
            ).applyFlex(flex = Flex(flexDirection = FlexDirection.ROW)).applyStyle(style = Style(backgroundColor = "#ffffff", margin = EdgeValue(bottom = 4.unitReal()), padding = EdgeValue(all = 15.unitReal())))


    fun criaListaTransacoes(): MutableList<ServerDrivenComponent> {
        var list: MutableList<ServerDrivenComponent> = ArrayList()
        for (i in transacoes){
            list.add(constroiTransacaoCard(i.tipoTransacao, i.valorTransacao))
        }
        return list
    }

}