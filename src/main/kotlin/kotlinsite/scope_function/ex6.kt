package kotlinsite.scope_function

/**
 * run을 사용할 때 return이 lambda여서 불편할 것이다? nono
 * returm value를 생략하고 가장 마지막의 결과가 된다.
 *
 */

fun main(){
    val numbers = mutableListOf("1","2","3")
    val countEndsWithE = numbers.run{
        add("four")
        add("five")
        count{it.endsWith("e")}
    }
    println("e로 끝나는 단어의 개수 : $countEndsWithE")

    with(numbers){
        val firstItem = first()
        val lastItem = last()
        println("first item : $firstItem, last item : $lastItem")
    }
}