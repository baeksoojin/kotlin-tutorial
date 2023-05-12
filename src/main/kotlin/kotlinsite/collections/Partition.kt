package collections

/**
 *
 * partition을 사용하여 조건을 걸면 그 조건에 맞게 Pair가 저장됨.
 * pair에 대해서 접근할 때 - first, second로 접근하면 됨.
 *
 */

fun main(){
    val numbers = listOf<Int>(1, -2, 3, -4)

    val evenOdd = numbers.partition { it % 2  == 0 }
    val (positives, negatives) = numbers.partition { it > 0 }

    println("Numbers: $numbers")
    println("Even numbers: ${evenOdd.first}")
    println("Odd numbers: ${evenOdd.second}")
    println("Positive numbers: $positives")
    println("Negative numbers: $negatives")

}