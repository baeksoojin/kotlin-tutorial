package kotlinsite.scope_function

fun processNonNullString(str: String){}

fun main(){
    val str: String? = "Hello"
    val length = str?.let{
        println("let() called on $it")
        processNonNullString(it)
        it.length
    }
    println(length)
}