package kotlinsite.scope_function

fun main(){
    val numbers = listOf("one","two","three")

    val modifiedFirstItem = numbers.first().let{
        it -> println("first item : $it")
        if(it.length >=5) it else "!" + it + "!"
    }.uppercase()

    println("first item after modifications : $modifiedFirstItem")
}