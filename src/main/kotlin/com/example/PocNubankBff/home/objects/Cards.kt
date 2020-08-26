package com.example.PocNubankBff.home.objects

import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.Widget
import br.com.zup.beagle.widget.action.Navigate
import br.com.zup.beagle.widget.action.Route
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.navigation.Touchable
import br.com.zup.beagle.widget.ui.Image
import br.com.zup.beagle.widget.ui.ImagePath
import br.com.zup.beagle.widget.ui.Text
import com.example.PocNubankBff.UtilVariables

val styleCards =  Style(
        backgroundColor = UtilVariables.stylesVariables().secondaryColor,
        size = Size(
                width = 110.unitReal(),
                height = 100.unitPercent()
        ),
        margin = EdgeValue(right = 10.unitReal()
        ),
        padding = EdgeValue(all = 7.5.unitReal())
)

val imageSize = Style(size = Size(height = 35.unitReal(), width = 35.unitReal()))

val textStyle = Style(margin = EdgeValue(top = 17.unitReal()))

class Cards: Widget() {

    fun payment() = Touchable(onPress = listOf(Navigate.PushView(Route.Remote("/pagamento"))),
            child = Container(
                    children = listOf(
                            Image(path = ImagePath.Local.justMobile(mobileId = "pagamento")).applyStyle(imageSize),
                            Text(text = "Pagamentos", styleId = "cardText").applyStyle(textStyle)
                    )
            ).applyStyle(styleCards).applyFlex(flex = Flex(flexDirection = FlexDirection.COLUMN))
    )

    fun poupanca() = Touchable(onPress = listOf(Navigate.PushView(Route.Remote("/poupanca"))),
            child = Container(
                    children = listOf(
                            Image(path = ImagePath.Local.justMobile(mobileId = "poupanca")).applyStyle(imageSize),
                            Text(text = "Poupaça", styleId = "cardText").applyStyle(textStyle)
                    )
            ).applyStyle(styleCards).applyFlex(flex = Flex(flexDirection = FlexDirection.COLUMN))
    )

    fun deposito() = Touchable(onPress = listOf(Navigate.PushView(Route.Remote("/deposito"))),
            child = Container(
                    children = listOf(
                            Image(path = ImagePath.Local.justMobile(mobileId = "deposito")).applyStyle(imageSize),
                            Text(text = "Depósitos", styleId = "cardText").applyStyle(textStyle)
                    )
            ).applyStyle(styleCards).applyFlex(flex = Flex(flexDirection = FlexDirection.COLUMN))
    )

    fun userConf() = Touchable(onPress = listOf(Navigate.PushView(Route.Remote("/userconf"))),
            child = Container(
                    children = listOf(
                            Image(path = ImagePath.Local.justMobile(mobileId = "userconf")).applyStyle(imageSize),
                            Text(text = "Configurações de Usuário", styleId = "cardText").applyStyle(textStyle)
                    )
            ).applyStyle(styleCards).applyFlex(flex = Flex(flexDirection = FlexDirection.COLUMN))
    )

    fun saqueCartao() = Touchable(onPress = listOf(Navigate.PushView(Route.Remote("/saquecartao"))),
            child = Container(
                    children = listOf(
                            Image(path = ImagePath.Local.justMobile(mobileId = "saquecartao")).applyStyle(imageSize),
                            Text(text = "Saque do Cartão", styleId = "cardText").applyStyle(textStyle)
                    )
            ).applyStyle(styleCards).applyFlex(flex = Flex(flexDirection = FlexDirection.COLUMN))
    )
}

