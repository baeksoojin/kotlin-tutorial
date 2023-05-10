package tutorial

open class Dog {                // 1
    open fun sayHello() {       // 2
        println("wow wow!")
    }
}

class Yorkshire : Dog() {       // 3
    override fun sayHello() {   // 4
        println("wif wif!")
    }
}

open class Tiger(val origin: String) { //class 선언과 동시에 매개변수로 변수를 설정가능. -> java의 생성자와 차이점
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")                  // 1

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India") // 1


fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()//wif wif! 출력을 예상 => 맞음//

    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()// A tiger from Siberia says: grrhhh! 예측 -> 맞음

    val lion: Lion = Asiatic("Rufo")   // 이것역시 class 선언과 동시에 파라미터 넘기기                         // 2
    lion.sayHello()

}

// public  -> open