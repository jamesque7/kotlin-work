// Task 4.7: finding the longest line in a file

import kotlin.io.path.*
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if(args.size!=1){
        println("Error: Invalid Input")
        exitProcess(1)
    }

    val path = Path(args[0])
    val lines = path.readLines()
    var maxIndex = 0
    var maxLength = lines[0].length

    for(i in 1..lines.size-1){
        var currentSize = lines[i].length
        if(currentSize>maxLength){
            maxLength = currentSize
            maxIndex = i+1
        }
    }

    println("Line $maxIndex is the longest with $maxLength characters!")
}