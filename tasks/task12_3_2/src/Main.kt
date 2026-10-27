// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main(){
    val jamesDob = LocalDate(2007, 5, 23)

    val jamesMarried = Person("Jimbo", jamesDob).apply{
        isMarried = true
    }

    println("Name: ${jamesMarried.name}\nDOB: ${jamesMarried.DOB}\nMarriage Status: ${if(jamesMarried.isMarried == true){
    "Married"}else{ "Not married" }}")
}