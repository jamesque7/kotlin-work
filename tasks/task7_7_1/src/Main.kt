// Task 7.7.1: program to compute stats for a numeric dataset
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if(args.size != 1){
        println("Error: Expected input size of 1")
        exitProcess(1)
    }

    val list = readData(args[0])
    statistics(list)

}