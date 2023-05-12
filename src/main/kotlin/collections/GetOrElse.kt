package collections

fun main(){

    val list = listOf<Int>(0,10,20)
    println(list.getOrElse(1){42})
    println(list.getOrElse(10){42}) // 10 index는 없으니까 out of range임 -> 그때 42를 출력함.

    val map = mutableMapOf<String, Int?>()
    println(map.getOrElse("x") {1}) // 1을 반환 -> null이여서 -> null이 가능한 것은 ?이기때문에 optional 적용
    map["x"] = 3
    println(map.getOrElse("x") {1}) // 3을 반환
    map["x"] = null
    println(map.getOrElse("x") {1}) // 1을 반환

}