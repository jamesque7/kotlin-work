// Task 5.1.1: anagrams() function

infix fun String.anagramOf(second: String) = this.lowercase().toList().sorted() == second.lowercase().toList().sorted()