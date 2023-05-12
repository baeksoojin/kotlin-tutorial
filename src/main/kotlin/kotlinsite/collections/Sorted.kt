package collections

import java.lang.Math.abs

/**
 * sort를 사용.
 * 순서를 reverse -> sortedBy { -it }을 사용해야함./ sortedDescending method를 사용할 수도 있음.
 * By가 있으면 조건을 입력을 해야함.
 * sortedByDescending -> abs(it)을 사용하면 역으로 정렬할 때 abs의 값을 기준으로 정렬
 */

fun main(){

    val shuffled = listOf<Int>(5,4,2,1,3,-10)
    val natural = shuffled.sorted()
    val inverted = shuffled.sortedBy { -it }
    val descending = shuffled.sortedDescending()
    val descendingBy = shuffled.sortedByDescending { abs(it) }

    println("Shuffled: $shuffled")
    println("Natural order: $natural")
    println("Inverted natural order: $inverted")
    println("Inverted natural order value: $descending")
    println("Inverted natural order of absolute values: $descendingBy")

}