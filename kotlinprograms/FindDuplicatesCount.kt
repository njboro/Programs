package kotlinprograms


fun findDuplicatesCount(arr: IntArray) : Map<Int, Int> {

    //Count frequency
    val mapFrequency = mutableMapOf<Int, Int>()

    for (num in arr) {
        mapFrequency[num] = mapFrequency.getOrDefault(num, 0 ) + 1
    }

    return mapFrequency.filter {
        it.value > 1
    }
}

fun main() {
    println(findDuplicatesCount(intArrayOf(1,2,3,1,1,3,4,5,6)))
    //Output: 1,3
}
