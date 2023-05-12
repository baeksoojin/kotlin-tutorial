package collections

/**
 *
 * first를 통해서 가장 작은 Index에 해당하는 value 추출
 * last를 통해서 가장 큰 Index에 해당하는 value 추출
 * 만약 조건을 걸거라면 ? -> { it으로 접근해서 조건을 넣을 수 있음. }
 */

fun main(){
    //sampleStart
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val first = numbers.first()
    val last = numbers.last()
    val firstEven = numbers.first { it % 2 == 0 }
    val lastOdd = numbers.last { it % 2 != 0 }

    println("Numbers: $numbers")
    println("First $first, last $last, first even $firstEven, last odd $lastOdd")

}

