package kotlinprograms

fun main() {

    //Nullable
    val name: String? = "Soon"

    //Safe call
    println(name?.length)

    //Elvis
    println(name?:"Moon")

    //Non-null assertion
    println(name!!.length)

    //Safe call with let
    name?.let {
        println("The name length is ${it.length}")
    }
}