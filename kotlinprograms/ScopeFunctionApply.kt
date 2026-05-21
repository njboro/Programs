package kotlinprograms

data class Person(var name: String)

fun main() {
    val name: String? = "Nabajyoti"

    val result = transformName(name)
    println(result)
}

fun transformName(s: String?): String {
    val person = Person(name = "Moon").apply {
        s?.let {
            name = it
        }
    }
    return person.name.uppercase()
}
