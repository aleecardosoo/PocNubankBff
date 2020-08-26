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

data class UserVariables(
        val userVariablesNome: String
)

object UserConfPage : ScreenBuilder {

    override fun build() = Screen( style = Style(backgroundColor = UtilVariables.stylesVariables().primaryColor),
            child = Container(context = ContextData(id = "userVariables", value = UserVariables(userVariablesNome = "0")),
                    children = listOf(
                            Text(text = "Como você gostaria de ser chamado?", styleId = "bigWhite").applyStyle(Style(margin = EdgeValue(vertical = 10.unitReal()))),
                            TextInput(placeholder = "", type = TextInputType.TEXT, styleId = "valueInput", onChange = listOf(SetContext(contextId = "userVariables", path = "userVariablesNome", value = "@{onChange.value}"))).applyStyle(Style(margin = EdgeValue(vertical = 10.unitReal()))),
                            Button(text = "CONTINUAR", styleId = "bigButton",
                                    onPress = listOf(SendRequest(url = "/userconf/@{userVariables.userVariablesNome}", onSuccess = listOf(Navigate.ResetStack(Route.Remote("/")))))
                            ).applyStyle(Style(size = Size(width = 100.unitPercent(), height = 40.unitReal()), margin = EdgeValue(vertical = 10.unitReal())))

                    )
            )
    )
}