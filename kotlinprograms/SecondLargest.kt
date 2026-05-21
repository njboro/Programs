package kotlinprograms

fun secondLargest(arr: IntArray) : Int? {

    val distinct = arr.distinct().sortedDescending()
    return if (distinct.size >= 2) distinct[1] else null
}

fun main() {
    println(secondLargest(intArrayOf(1,2,3,4,5,6)))
}