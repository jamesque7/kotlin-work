// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>){
    if (args.size != 1){
        println("Error: Invalid Input")
        exitProcess(1)
    }

    val userInput = args[0].toInt()

    for(n in 1..userInput){
        if(n%2 != 0){
            println(n)
        }
    }


}
