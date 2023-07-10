package kotlinsite.scope_function

/**
 * also와 apply를 함께 사용할 수 있고 이는 결국 둘다 object를 반환하기 때문에 이어서 작성이 가능한것이다.
 */

fun main(){
    val numberList = mutableListOf<Double>()
    numberList.also { println("populating the list") }
        .apply {
            add(1.2)
            add(3.4)
            add(8.333)
        }
        .also { println("sorting the list") }
        .sort()

    println(numberList)
}