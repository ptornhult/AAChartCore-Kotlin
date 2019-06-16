package com.example.chartcorekotlin.AAChartConfiger


import java.util.Dictionary
import java.util.HashMap

/**
 * Created by anan on 2018/4/16.
 */

class AASeriesElement {

    private var type: String? = null
    private var name: String? = null
    private var data: Array<Any>? = null
    private var lineWidth: Float? = null//折线图、曲线图、直方折线图、折线填充图、曲线填充图、直方折线填充图的线条宽度
    private var color: Any? = null
    private var fillColor: Any? = null
    private var fillOpacity: Float? = null//折线填充图、曲线填充图、直方折线填充图等填充图类型的填充颜色透明度
    private var threshold: Float? = null//The threshold, also called zero level or base level. For line type series this is only used in conjunction with negativeColor. default：0.
    private var negativeColor: String? = null// The color for the parts of the graph or points that are below the threshold
    private var dashStyle: String? = null
    private var dataLabels: Dictionary<*, *>? = null
    private var marker: Dictionary<*, *>? = null
    private var step: Any? = null
    private var colorByPoint: Boolean? = null
    private var zIndex: Int? = null
    private var zones: Array<Any>? = null
    private var shadow: AAShadow? = null


    fun type(prop: AAChartType): AASeriesElement {
        this.type = prop.toString()
        return this
    }

    fun name(prop: String): AASeriesElement {
        this.name = prop
        return this
    }

    fun data(prop: Array<Any>): AASeriesElement {
        this.data = prop
        return this
    }

    fun lineWidth(prop: Float?): AASeriesElement {
        this.lineWidth = prop
        return this
    }

    fun color(prop: Any): AASeriesElement {
        this.color = prop
        return this
    }

    fun fillColor(prop: Any): AASeriesElement {
        fillColor = prop
        return this
    }

    fun fillOpacity(prop: Float?): AASeriesElement {
        this.fillOpacity = prop
        return this
    }

    fun threshold(prop: Float?): AASeriesElement {
        this.threshold = prop
        return this
    }

    fun negativeColor(prop: String): AASeriesElement {
        this.negativeColor = prop
        return this
    }

    fun dashStyle(prop: AAChartLineDashSyleType): AASeriesElement {
        this.dashStyle = prop.toString()
        return this
    }

    fun dataLabels(prop: Dictionary<*, *>): AASeriesElement {
        this.dataLabels = prop
        return this
    }

    fun marker(prop: Dictionary<*, *>): AASeriesElement {
        this.marker = prop
        return this
    }

    fun step(prop: Any): AASeriesElement {
        this.step = prop
        return this
    }

    fun colorByPoint(prop: Boolean?): AASeriesElement {
        this.colorByPoint = prop
        return this
    }

    fun zIndex(prop: Int?): AASeriesElement {
        this.zIndex = prop
        return this
    }

    fun zones(prop: Array<HashMap<String, Any>>): AASeriesElement {
        zones = arrayOf(prop)
        return this
    }

    fun shadow(prop: AAShadow): AASeriesElement {
        shadow = prop
        return this
    }


}

class AAShadow {
    private var color: String? = null
    private var offsetX: Float? = null
    private var offsetY: Float? = null
    private var opacity: Float? = null
    private var width: Float? = null

    fun color(prop: String): AAShadow {
        color = prop
        return this
    }

    fun offsetX(prop: Float?): AAShadow {
        offsetX = prop
        return this
    }

    fun offsetY(prop: Float?): AAShadow {
        offsetY = prop
        return this
    }

    fun opacity(prop: Float?): AAShadow {
        opacity = prop
        return this
    }

    fun width(prop: Float?): AAShadow {
        width = prop
        return this
    }

}
