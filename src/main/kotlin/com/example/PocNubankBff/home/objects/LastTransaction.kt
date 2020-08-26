package com.example.PocNubankBff.home.objects

import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.action.Navigate
import br.com.zup.beagle.widget.action.Route
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.navigation.Touchable
import br.com.zup.beagle.widget.ui.Image
import br.com.zup.beagle.widget.ui.ImagePath
import br.com.zup.beagle.widget.ui.Text
import com.example.PocNubankBff.UtilVariables
import com.example.PocNubankBff.model.UserAccount

class LastTransaction {

    fun CarrousselView() =
        Touchable(onPress = listOf(Navigate.PushView(Route.Remote(url = "/listatransacoes"))),
                child = Container(children = listOf(
                        Image(path = ImagePath.Local.justMobile(mobileId = "carrinho")).applyStyle(style = Style(size = Size(aspectRatio = 1.0))),
                        Text(text = UserAccount.lastTransationMessage()).applyStyle(style = Style(size = Size(width = 70.unitPercent()))).applyFlex(flex = Flex(alignSelf = AlignSelf.CENTER))
                )).applyFlex(flex = Flex(flexDirection = FlexDirection.ROW)).applyStyle(Style(backgroundColor = UtilVariables.stylesVariables().tertiaryColor, margin = EdgeValue(top = 50.unitReal()),size = Size(width = 100.unitPercent(), height = 30.unitPercent())))
        )
    }