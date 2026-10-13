// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle): Boolean{
    val num1 = triangle.first+triangle.second
    val num2 = triangle.first+triangle.third
    val num3 = triangle.second+triangle.third

    if(triangle.first>=num1 || triangle.first>=num2 || triangle.first>=num3){
        return false
    }else if(triangle.second>=num1 || triangle.second>=num2 || triangle.second>=num3){
        return false
    }else if(triangle.third>=num1 || triangle.third>=num2 || triangle.third>=num3){
        return false
    }else{
        return true
    }
}

fun triangleArea(triangle: Triangle): Double{
        val num1 = triangle.first
        val num2 = triangle.second
        val num3 = triangle.third

        val semiPerimeter = 0.5*(num1+num2+num3)
        val sqrdNum = semiPerimeter*(semiPerimeter-num1)*(semiPerimeter-num2)*(semiPerimeter-num3)

        val area = sqrt(sqrdNum)
        return area
}