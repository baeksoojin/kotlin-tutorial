package specialclasses

/**
 * sealed를 사용해서 동일 패키지 내부에서만 클래스 상속이 가능하도록 한다.
 * 동봉된 클래스 -> sealed class type
 *
 */

sealed class Mammal(val name: String)

class Cat(val catName: String): Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal):String{
    when(mammal){
        is Human -> return "hello ${mammal.name} "
        is Cat -> return "hello ${mammal.name}"
    }
}

fun main(){
    println(greetMammal(Cat("cat")))
}