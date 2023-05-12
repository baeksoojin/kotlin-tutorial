package collections


/**
 * any -> 적어도 하나 이상 있다면 true를 반환 , 아무것도 없다면 false를 반환한다.
 * all -> 모두가 해야할 때 true, 아니라면 false
 * none -> 모두가 해당하지 않을 때 true, 아니라면 false : no element
 */

val numbersBound = listOf(1, -2, 3, -4, 5, -6)
val anyNegative = numbersBound.any { it < 0 }
val anyGT6 = numbersBound.any { it > 6 }

val numberBound2 = listOf<Int>(1, -2, 3, -4)
val allEven = numberBound2.all{ it % 2 == 1} // 모두 홀수 일때 가능
val allLess6 = numberBound2.all{ it < 6 } // 모두 6보다 클 때 가능

val numberBound3 = listOf<Int>(1,-2)
val noneEven = numberBound3.none { it % 2 == 1}
val noneLess6 = numberBound3.none { it > 6 }

fun main(){

    println("any test ---------- ")
    println(numbersBound)
    println(anyNegative)
    println(anyGT6)

    println("all test ----------- ")
    println(allEven)
    println(allLess6)

    println("non test ----------- ")
    println(noneEven)
    println(noneLess6)

}