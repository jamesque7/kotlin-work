// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(val A: Double, val B: Double, val C: Double) {
    val sideA = A
    val sideB = B
    val sideC = C

    init {
        val num1 = sideA + sideB
        val num2 = sideA + sideC
        val num3 = sideB + sideC

        require(sideA < num3){"Invalid Triangle"}

        require(sideB < num2){"Invalid Triangle"}

        require(sideC < num1){"Invalid Triangle"}
        }

    val perimeter get() = sideA + sideB + sideC
    val semiPerimeter get() = (sideA + sideB + sideC) / 2
    val area get() = sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))

    override fun toString(): String = "Triangle($sideA, $sideB, $sideC)"
}

fun main(){

}