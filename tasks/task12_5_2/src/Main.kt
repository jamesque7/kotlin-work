// Task 12.5.2: demo program for class with custom getter
import kotlinx.datetime.LocalDate

fun main(){
    val person = Person("jAmes", birth = LocalDate(2007,5,23))
    println(person.name)
}