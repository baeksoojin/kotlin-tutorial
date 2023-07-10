package kotlinsite.scope_function

fun main(){

    //map만 사용한 경우
    val numbers = mutableListOf("1","two","three","4","5")
    val resultList = numbers.map{it.length}.filter { it>3 }
    println(resultList)

    //let

    numbers.map { it.length }.filter { it>3 }.let{
        println(it)
    }

    //map과 le을 함께 사용
    numbers.map { it }.groupBy { it.length }.let{
        println(it)
        it.forEach{
            (each,value) -> println(" $each , $value" )
        }
    }
}