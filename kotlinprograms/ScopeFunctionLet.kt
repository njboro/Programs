package kotlinprograms

fun main() {
    val name : String? = "Nabajyoti"

    println(capitalize(name))
}

fun capitalize(s : String?): String {
    s?.let {
        return it.uppercase()
    }
    return s?:"-"
}