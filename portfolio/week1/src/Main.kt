// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if(args.size<3){
        println("Error: values for a, b, c required on command line")
        exitProcess(1)

    }
    else{
        val num1 = args[0].toDouble()
        val num2 = args[1].toDouble()
        val num3 = args[2].toDouble()

        val semiPerimeter = 0.5*(num1+num2+num3)
        val sqrdNum = semiPerimeter*(semiPerimeter-num1)*(semiPerimeter-num2)*(semiPerimeter-num3)

        val area = sqrt(sqrdNum)
        println("Area = %.5f".format(area))
    }
}