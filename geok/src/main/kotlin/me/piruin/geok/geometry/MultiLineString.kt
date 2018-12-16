package me.piruin.geok.geometry

import me.piruin.geok.BBox

data class MultiLineString(val lines: List<LineString>) : MultiGeometry {

    constructor(vararg lineString: LineString) : this(lineString.toList())

    override val type: String = javaClass.simpleName
    override val bbox: BBox = BBox.from(lines.flatMap { it.coordinates })
}
