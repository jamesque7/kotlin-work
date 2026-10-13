// Task 5.1.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if (args.size != 2){
        println("Error: Invalid Input")
        exitProcess(1)
    }

    if(args[1] anagramOf args[0]){
        println("${args[0]} and ${args[1]} are anagrams")
    }else{
        println("These words are not anagrams")
    }
/*
    val word1 = args[0]
    val word2 = args[1]

    val result = anagrams(word1, word2)

    if(result == true){
        println("Those two words are anagrams")
    }else{
        println("Those two words are not anagrams")
    }

 */
}