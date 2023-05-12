package collections

/**
 * ->  : 뒤에서 계산을 진행
 * it : 바로 연산을 진행
 */

val number = listOf(1, -2, 3, -4, 5, -6)
val doubled = numbers.map { x -> x*2 }
val tripled = numbers.map { it * 3 }

fun main(){
    println(doubled)
    println(tripled)
}