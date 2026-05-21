package kotlinprograms

/*
* Using Set*/
fun findDuplicateUsingSet(nums: IntArray): List<Int> {
    val seen = mutableSetOf<Int>()
    val duplicates = mutableSetOf<Int>()

    for (num in nums) {
        if (!seen.add(num)) {
            duplicates.add(num)
        }
    }

    return duplicates.toList()
}

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 3, 2, 7, 8, 2, 10)
//    val duplicates = findDuplicateUsingSet(array)
//    val duplicates = findDuplicatesUsingHashMap(array)
    val duplicates = findDuplicatesUsingOneLiner(array)

    //Output: [3, 2]
    println(duplicates)
}

/*
* Solution 2 (Using HashMap – Frequency)
* */

fun findDuplicatesUsingHashMap(arr: IntArray): List<Int> {
    val map = mutableMapOf<Int, Int>()

    for (num in arr) {
        map[num] = map.getOrDefault(num, 0) + 1
    }

    return map.filter {
        it.value > 1
    }.keys.toList()
}

/*
* Solution 3 (Kotlin One-liner 😏)
* */

fun findDuplicatesUsingOneLiner(arr: IntArray) : List<Int> {

    println(arr.groupBy { it }.filter {
        it.value.size > 1
    })

    return arr.groupBy { it }.filter {
        it.value.size > 1
    }.keys.toList()
}