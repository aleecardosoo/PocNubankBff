package com.example.PocNubankBff.home.objects

import br.com.zup.beagle.core.CornerRadius
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.Widget
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.ui.Image
import br.com.zup.beagle.widget.ui.ImagePath
import br.com.zup.beagle.widget.ui.Text
import com.example.PocNubankBff.UtilVariables
import com.example.PocNubankBff.model.UserAccount

class PageFatura : Widget() {

    fun page() = Container(
            children = listOf(
                    Container(children = listOf(
                            Image(path = ImagePath.Local.justMobile(
                                    mobileId = "creditcard")).applyStyle(style = Style(size = Size(aspectRatio = 0.7))),
                            Text(text = "FATURA ATUAL", styleId = "smalltitle"),
                            Text(text = "R$ " + UserAccount.fatura.toString(), styleId = "maintext"),
                            Container(children = listOf(Text(text = "Limite disponível ", styleId = "smallblack"), Text(text = "R$ " + UserAccount.limite.toString(), styleId = "smallgreen"))).applyFlex(flex = Flex(flexDirection = FlexDirection.ROW)))).applyStyle(Style(padding = EdgeValue(left = 20.unitReal()))).applyFlex(flex = Flex(alignItems = AlignItems.FLEX_START)),
                    LastTransaction().CarrousselView()
            ))


}
