// Task 12.1: Point class
import kotlin.math.hypot

class point(var x: Double, var y: Double){

    fun distanceTo(other: point) = hypot(x-other.x, y-other.y)

}