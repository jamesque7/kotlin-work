// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    if(args.size != 3){
        print("Error: Invalid Input")
        exitProcess(1)
    }

    val initialTemp = args[0].toFloat()
    val maxTemp = args[1].toFloat()
    val tempIncrement = args[2].toFloat()
    var currentTemp = initialTemp
    var currentFarenheitTemp = (currentTemp*1.8)+32

    println("Celsius Farenheit")
    println("%7.1f %9.1f".format(currentTemp, currentFarenheitTemp))

    do {
        currentTemp = currentTemp+tempIncrement
        currentFarenheitTemp = (currentTemp*1.8)+32
        println("%7.1f %9.1f".format(currentTemp, currentFarenheitTemp))
    }while (currentTemp<=maxTemp)




}
