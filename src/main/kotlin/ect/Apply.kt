package ect

/**
 * 함수형 프로그래밍 Scope function
 * apply -> 스코프 람다함수 사용시, 더 간결하게 사용할 수 있도록 도와줌
 * this가 receiver로 itself를 반환한다.
 */

fun main(){
    var a = Book("a", 20000)

    //apply 스코프 람다함수를 사용해서 함수형 프로그램을 더 간략하게 사용
    a.apply {
        name = "apply name"
        dc()//2000 dc
    }
    a.printName()
}

class Book(var name: String, var price: Int){
    fun dc() {
        price -= 2000
    }

    fun printName(){
        println("$name $price")
    }
}

