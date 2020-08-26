package com.example.PocNubankBff.home.objects

import br.com.zup.beagle.builder.widget.size
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.ui.text
import br.com.zup.beagle.widget.Widget
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.ui.Button
import br.com.zup.beagle.widget.ui.Image
import br.com.zup.beagle.widget.ui.ImagePath
import br.com.zup.beagle.widget.ui.Text
import com.example.PocNubankBff.model.UserAccount

class Title : Widget() {
    fun title() = Container(
            children =
            listOf(Image(
                    path = ImagePath.Local.justMobile(
                            mobileId = "logo")
                    ).applyStyle(Style(size = Size(width = 45.unitReal(), height = 55.unitReal()))),
            Text(text = UserAccount.name, styleId = "name").applyFlex(Flex(alignSelf = AlignSelf.CENTER))
            )
    ).applyFlex(Flex(flexDirection = FlexDirection.ROW)).applyStyle(style = Style(margin = EdgeValue(top = 40.unitReal())))
}
