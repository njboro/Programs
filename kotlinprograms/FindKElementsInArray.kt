package kotlinprograms

fun main() {
    val k = 4
    val array = intArrayOf(3,1,4,4,4,5,2,6,1)

    println(findKElements(array, k).contentToString())
    println("----------------------------------------------------")
    println(findKElementsList(array, k))
}

fun findKElements(array: IntArray, k: Int): IntArray {
    //Frequency count
    val frequencyMap = mutableMapOf<Int, Int>()
    for (num in array) {
        frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
    }

    //Sort the map
    val sortedMap = frequencyMap.entries.sortedByDescending {
        it.value
    }

    val result = IntArray(k)
    //Take Top K elements
    for (i in 0 until k) {
        result[i] = sortedMap[i].key
    }


    return result

}

fun findKElementsList(array: IntArray, k: Int): List<Int> {
    //Frequency count
    val frequencyMap = mutableMapOf<Int, Int>()
    for (num in array) {
        frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
    }

    //Sort the map
    val sortedMap = frequencyMap.entries.sortedByDescending {
        it.value
    }

    val result = mutableListOf<Int>()
    //Take Top K elements
    for (i in 0 until k) {
        result.add(sortedMap[i].key)
    }


    return result

}