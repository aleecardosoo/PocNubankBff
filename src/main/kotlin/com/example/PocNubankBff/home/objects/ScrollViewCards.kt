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
import br.com.zup.beagle.widget.layout.PageView
import br.com.zup.beagle.widget.layout.ScrollView
import br.com.zup.beagle.widget.ui.Button
import com.example.PocNubankBff.UtilVariables

val styleButton =  Style(
        backgroundColor = UtilVariables.stylesVariables().secondaryColor,
        size = Size(
                width = 110.unitReal(),
                height = 100.unitPercent()
        ),
        margin = EdgeValue(right = 10.unitReal()
        )
)

class ScrollViewCards : Widget() {

    fun scrollView() = Container(
            children = listOf(
                    ScrollView(scrollDirection = ScrollAxis.HORIZONTAL,
                            scrollBarEnabled = false,
                            children =
                    listOf(
                            Cards().payment(),
                            Cards().deposito(),
                            Cards().poupanca(),
                            Cards().saqueCartao(),
                            Cards().userConf()
//                            Button(text = "Ajustar limite").applyStyle(style = styleButton),
//                            Button(text = "Ajustar limite").applyStyle(style = styleButton)
                    )
                    )
            )
    )

}