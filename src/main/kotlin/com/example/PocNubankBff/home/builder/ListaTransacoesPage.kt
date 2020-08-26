package com.example.PocNubankBff.home.builder

import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.ui.*
import com.example.PocNubankBff.model.UserAccount
import br.com.zup.beagle.action.NavigatePopToViewBuilder
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.action.*
import br.com.zup.beagle.widget.context.ContextData
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import com.example.PocNubankBff.UtilVariables
import com.example.PocNubankBff.data.TransactionRepository

object ListaTransacoesPage : ScreenBuilder {

    override fun build() = Screen(style = Style(backgroundColor = UtilVariables.stylesVariables().primaryColor),
            child = Container(
                    children = listOf(
                            ListView(
                                            TransactionRepository().criaListaTransacoes()
                            )
                    )

            )
    )
}