package com.example.PocNubankBff.home.builder

import br.com.zup.beagle.core.CornerRadius
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.widget.Widget
import br.com.zup.beagle.widget.action.Alert
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.ui.Button
import br.com.zup.beagle.widget.ui.ImagePath
import br.com.zup.beagle.widget.ui.Text
import com.example.PocNubankBff.UtilVariables
import com.example.PocNubankBff.home.objects.CarrousselPages
import com.example.PocNubankBff.home.objects.ScrollViewCards
import com.example.PocNubankBff.home.objects.Title


object ScreenBeagleBuilder : ScreenBuilder {
    override fun build() = Screen(style = Style(backgroundColor = UtilVariables.stylesVariables().primaryColor),
            child = Container(
                    children = listOf(
                            Title().title(),
                            CarrousselPages().carroussel().applyFlex(flex = Flex(alignSelf = AlignSelf.CENTER)).applyStyle(Style(margin = EdgeValue(top = 40.unitReal()), backgroundColor = UtilVariables.stylesVariables().lightColor, size = Size(width = 90.unitPercent(), height = 350.unitReal()), cornerRadius = CornerRadius(40.0))),
                            ScrollViewCards().scrollView().applyFlex(flex = Flex(alignSelf = AlignSelf.FLEX_END)).applyStyle(style = Style(margin = EdgeValue(top = 60.unitReal(),left = 20.unitReal()), size = Size(height = 90.unitReal())))
                    )

            ).applyFlex(Flex(alignItems = AlignItems.CENTER)).applyStyle(style = Style(size = Size(height = 100.unitPercent(), width = 100.unitPercent())))
    )
}