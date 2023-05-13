package w3school.oop

// Superclass
open class MyParentClass {
    val x = 5
}

// Subclass
class MyChildClass: MyParentClass() {
    fun myFunction() {
        println(x)
    }
}

fun main() {
    val myObj = MyChildClass()
    myObj.myFunction()
}