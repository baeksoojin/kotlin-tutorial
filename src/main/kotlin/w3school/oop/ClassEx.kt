package w3school.oop

class Car{
    var brand = ""
    var model = ""
    var year = 0
}

fun main(){
    val c1 = Car()

    c1.brand = "ford"
    c1.model = "mustang"
    c1.year = 1969

    var c2 = Car()

    c2.brand = "bmw"
    c2.model = "x5"
    c2.year = 1999

    println(c1.brand)
    println(c2.brand)
}