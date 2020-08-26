package com.example.PocNubankBff.home.builder

import br.com.zup.beagle.action.NavigatePopToViewBuilder
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.action.*
import br.com.zup.beagle.widget.context.ContextData
import br.com.zup.beagle.widget.core.EdgeValue
import br.com.zup.beagle.widget.core.Size
import br.com.zup.beagle.widget.core.TextInputType
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.ui.Button
import br.com.zup.beagle.widget.ui.Text
import br.com.zup.beagle.widget.ui.TextInput
import com.example.PocNubankBff.UtilVariables

data class ResgatarVariables(
        val resgatarValue: String
)

object ResgatarPage : ScreenBuilder {

    override fun build() = Screen( style = Style(backgroundColor = UtilVariables.stylesVariables().primaryColor),
            child = Container(context = ContextData(id = "resgatarVariables", value = ResgatarVariables(resgatarValue = "0")),
                    children = listOf(
                            Text(text = "Quanto você quer resgatar?", styleId = "bigWhite").applyStyle(Style(margin = EdgeValue(vertical = 10.unitReal()))),
                            TextInput(placeholder = "R$ 0,00", type = TextInputType.NUMBER, styleId = "valueInput", onChange = listOf(SetContext(contextId = "resgatarVariables", path = "resgatarValue", value = "@{onChange.value}"))).applyStyle(Style(margin = EdgeValue(vertical = 10.unitReal()))),
                            Button(text = "CONTINUAR", styleId = "bigButton",
                                    onPress = listOf(SendRequest(url = "/resgatar/@{resgatarVariables.resgatarValue}", onSuccess = listOf(Navigate.ResetStack(Route.Remote("/"))), onError = listOf(Alert(title = "", message = "Desculpe, seu saldo é insuficiente!"))))
                            ).applyStyle(Style(size = Size(width = 100.unitPercent(), height = 40.unitReal()), margin = EdgeValue(vertical = 10.unitReal())))

                    )
            )
    )
}