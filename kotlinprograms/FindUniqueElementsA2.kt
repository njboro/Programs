package kotlinprograms

fun main() {
    val list = arrayListOf(1, 2, 2, 3, 4, 4, 5)
    println(findUniqueElementsA2(list))
}

fun findUniqueElementsA2(list: ArrayList<Int>) : List<Int> {
    return list
        .groupingBy { it }
        .eachCount()
        .filter { it.value == 1 }
        .keys
        .toList()
}