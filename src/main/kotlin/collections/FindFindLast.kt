package collections


/**
 * find, findLast를 사용해서 조건에 맞는 value값이 존재하는지 찾아낼 수 있음. -> 맨 앞부터 탐ㅁ색
 *
 */

val words = listOf<String>("Lets", "find", "something", "in", "collection", "somehow")

val first = words.find{ it.startsWith("some")}
val last = words.findLast { it.startsWith("some") }

val nothing = words.find { it.contains("nothing") }

fun main(){

    println(first)
    println(last)
    println(nothing) // contains를 사용해서 list에서 특정 value값이 존재하는지 찾을(find를 사용) 수 있음.

}