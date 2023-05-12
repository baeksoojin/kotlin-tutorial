package collections

fun main(){

    val numbers = listOf<Int>(1,2,3,4,5)
    val totalCount = numbers.count()
    val evenCount = numbers.count{ it % 2 ==0 }

    println("total : $totalCount ")
    println("even element : $evenCount ")

}