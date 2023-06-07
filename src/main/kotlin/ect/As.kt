package ect

/**
 * as로 type casting을 진행하는데 우선 type 비교를 먼저하는 경우가 대부분이니, if조건문 안에서 is를 함께 사용
 */

open class Drink{
    var name="음료"
    open fun drink(){
        println("${name} drink")
    }
}

class Cola: Drink(){
    var type="콜라"
    override fun drink() = println("${type} drink")
    fun washD() = println("(${type} washing)")
}

fun main(){
    var a = Drink()
    a.drink()

    var b: Drink = Cola()
    b.drink()

    if(b is Cola){// is는 java에서의 instanceOf로 형태 비교
        b.washD() //if문 안에서만 일시적으로 casting이 진행됨
    }
    var c = b as Cola
    c.washD()
    b.washD()
}