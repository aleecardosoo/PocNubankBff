package com.example.PocNubankBff.home.objects

import br.com.zup.beagle.core.CornerRadius
import br.com.zup.beagle.core.Style
import br.com.zup.beagle.ext.applyFlex
import br.com.zup.beagle.ext.applyStyle
import br.com.zup.beagle.ext.unitPercent
import br.com.zup.beagle.ext.unitReal
import br.com.zup.beagle.pager.pageIndicator
import br.com.zup.beagle.widget.Widget
import br.com.zup.beagle.widget.core.AlignSelf
import br.com.zup.beagle.widget.core.Flex
import br.com.zup.beagle.widget.core.Size
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.PageView
import br.com.zup.beagle.widget.pager.PageIndicatorComponent
import com.example.PocNubankBff.UtilVariables

data class PageIndicator(
        val selectedColor: String,
        val unselectedColor: String
) : PageIndicatorComponent

class CarrousselPages : Widget() {

    fun carroussel() = Container(
            children = listOf(
                    PageView(pageIndicator = PageIndicator(UtilVariables.stylesVariables().primaryColor, UtilVariables.stylesVariables().lightPurple),
                            children =
                    listOf(
                            PageFatura().page(),
                            PageMoney().page(),
                            PageGift().page()
                    )
                    )
            )
    )

}