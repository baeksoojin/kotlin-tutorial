package collections

/**
 * list의 값에서 min, max에 접근하기 위해서는 min method or max method를 사용
 * null이 있을 수도 있다면 minOrNull 혹은 maxOrNull을 사용
 */


fun main(){
    val numbers = listOf<Int>(1,2,3)
    val empty = emptyList<Int>()
    val only = listOf(3)

    println("$numbers, min = ${numbers.minOrNull()} max = ${numbers.maxOrNull()}")
    println("$numbers, min = ${numbers.min()} max = ${numbers.max()}")
    println("Empty : $empty, min = ${empty.minOrNull()}, max = ${numbers.minOrNull()}")
    println("Only : $only, min = ${only.minOrNull()}, max = ${only.maxOrNull()}")
}