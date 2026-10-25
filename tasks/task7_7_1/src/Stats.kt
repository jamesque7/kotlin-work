// Task 7.7.1: statistics functions

fun median(inputList: List<Float>): Float{
    val list = inputList.sorted()
    val listLength = list.size

    if(listLength % 2 != 0){
        val index = ((listLength+1)/2)-1
        return list[index]
    }else{
        val num1 = list[(listLength/2)-1]
        val num2 = list[(listLength/2)]

        return (num1+num2)/2
    }


}

fun statistics(inputList: List<Float>){
    val mean = inputList.average()
    val minimum = inputList.min()
    val maximum = inputList.max()
    val median = median(inputList)

    println("Mean: ${mean}\nMinimum: ${minimum}\nMaximum: ${maximum}\nMedian: ${median}")
}