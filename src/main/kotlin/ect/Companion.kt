package ect

/**
 * java에서 static을 kotlin에서의 companion object를 사용
 */

class Person{
    companion object{//java에서의 static의 역할을 해줌
        const val MAX_AGE: Int = 500 // compile time에 500이라는 값으로 초기화

        fun sayHello(){
            println("안녕하세요~")
        }

    }
}

fun main(){
    println(Person.MAX_AGE)
    Person.sayHello()
}