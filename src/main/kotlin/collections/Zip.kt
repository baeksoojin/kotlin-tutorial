package collections

fun main(){
    val A = listOf<String>("A","B")
    val B = listOf<Int>(1,2)
    val C = listOf<Long>(1L, 2L)

    val resultPairs = A zip B zip C
    val resultReduce = A.zip(B) { a,b -> "$a$b"}

    println(resultPairs)
    println(resultReduce)
}