package kotlinprograms

fun main() {
    val list = arrayListOf(1, 2, 2, 3, 4, 4, 5)
    println(findUniqueElements(list))
}

fun findUniqueElements(list: ArrayList<Int>) : List<Int> {
    val freqMap = HashMap<Int, Int>()

    for(num in list) {
        freqMap[num] = freqMap.getOrDefault(num, 0)+1
    }

    return freqMap.filter{ it.value == 1}
        .keys
        .toList()
}