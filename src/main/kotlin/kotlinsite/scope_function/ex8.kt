package kotlinsite.scope_function

fun main(){
    val numbers = mutableListOf("one","two","three","four","five")
    numbers.map { it.length }.filter { it>3 }.let(::println)
}