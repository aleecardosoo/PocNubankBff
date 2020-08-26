package com.example.PocNubankBff.home.builder

import br.com.zup.beagle.action.NavigatePopToViewBuilder
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.action.*
import br.com.zup.beagle.widget.context.ContextData
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.navigation.Touchable
import br.com.zup.beagle.widget.ui.*
import com.example.PocNubankBff.UtilVariables

data class PoupancaVariables(
        val pouparValue: String,
        val resgatatr: String
)

object TypesPoupancaPage : ScreenBuilder {

    override fun build() = Screen(style = Style(backgroundColor = UtilVariables.stylesVariables().primaryColor),
            child = Container(
                    children = listOf(
                            Touchable(onPress = listOf(Navigate.PushView(Route.Remote("/poupar/"))),
                                    child = Container(listOf(
                                            Image(path = ImagePath.Local.justMobile(mobileId = "poupar")).applyStyle(Style(size = Size(height = 100.unitReal(), width = 100.unitReal()))).applyFlex(Flex(alignSelf = AlignSelf.CENTER)),
                                            Text(text = "Poupar", styleId = "bigWhite").applyFlex(Flex(alignSelf = AlignSelf.CENTER)).applyStyle(Style(margin = EdgeValue(left = 25.unitReal()))),
                                            Image(path = ImagePath.Local.justMobile(mobileId = "setadireita")).applyStyle(Style(margin = EdgeValue(left = 140.unitReal()), size = Size(height = 10.unitReal(), width = 10.unitReal()))).applyFlex(Flex(alignSelf = AlignSelf.CENTER))
                                    )).applyStyle(Style(padding = EdgeValue(all = 20.unitReal()), size = Size(height = 50.unitPercent(), width = 100.unitPercent()))).applyFlex(flex = Flex(flexDirection = FlexDirection.ROW, alignContent = AlignContent.CENTER, alignItems = AlignItems.CENTER))
                            ),

                            Touchable(onPress = listOf(Navigate.PushView(Route.Remote("/resgatar/"))),
                                    child = Container(listOf(
                                            Image(path = ImagePath.Local.justMobile(mobileId = "resgatar")).applyStyle(Style(size = Size(height = 100.unitReal(), width = 100.unitReal()))).applyFlex(Flex(alignSelf = AlignSelf.CENTER)),
                                            Text(text = "Resgatar", styleId = "bigWhite").applyFlex(Flex(alignSelf = AlignSelf.CENTER)).applyStyle(Style(margin = EdgeValue(left = 25.unitReal()))),
                                            Image(path = ImagePath.Local.justMobile(mobileId = "setadireita")).applyStyle(Style(margin = EdgeValue(left = 140.unitReal()), size = Size(height = 10.unitReal(), width = 10.unitReal()))).applyFlex(Flex(alignSelf = AlignSelf.CENTER))
                                    )).applyStyle(Style(padding = EdgeValue(all = 20.unitReal()), size = Size(height = 50.unitPercent(), width = 100.unitPercent()))).applyFlex(flex = Flex(flexDirection = FlexDirection.ROW))
                            )


                    )
            )
    )
}


//Text(text = "Quanto você quer pagar?", styleId = "bigWhite").applyStyle(Style(margin = EdgeValue(vertical = 10.unitReal()))),
//TextInput(placeholder = "R$ 0,00", type = TextInputType.NUMBER, styleId = "valueInput", onChange = listOf(SetContext(contextId = "poupancaVariables", path = "poupancaValue", value = "@{onChange.value}"))).applyStyle(Style(margin = EdgeValue(vertical = 10.unitReal()))),
//Button(text = "CONTINUAR", styleId = "bigButton",
//onPress = listOf(SendRequest(url = "/realizapagamento/@{poupancaVariables.poupancaValue}", onSuccess = listOf(Navigate.ResetStack(Route.Remote("/"))), onError = listOf(Alert(title = "", message = "Desculpe, seu saldo é insuficiente!"))))
//).applyStyle(Style(size = Size(width = 100.unitPercent(), height = 40.unitReal()), margin = EdgeValue(vertical = 10.unitReal())))