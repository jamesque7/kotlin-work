// Task 4.2: use of if and ranges

fun main() {
    println("Select:\n a)\n b)\n c)\n d)\n")
    val response = readln().lowercase()
    val respnseLength = response.length

    val output = if(respnseLength == 1 && response.first() in 'a'..'d'){
        "Valid Output"
    }else{
        "Error: Invalid Input"
    }

    print(output)

}
