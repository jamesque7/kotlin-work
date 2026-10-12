// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if(args.size != 3){
        print("Error: Enter 3 Integer Values")
        exitProcess(1)
    }

    val grade1 = args[0].toDouble()
    val grade2 = args[1].toDouble()
    val grade3 = args[2].toDouble()

    val average = (grade1+grade2+grade3)/3
    val roundedAvg = average.roundToInt()

    val grade = when (roundedAvg){
        in 0..39 -> "Fail"
        in 40..69 -> "Pass"
        in 41..100 -> "Distinction"
        else -> "N/A"
    }

    println("Grade: $grade\nRounded Average: $roundedAvg")
}