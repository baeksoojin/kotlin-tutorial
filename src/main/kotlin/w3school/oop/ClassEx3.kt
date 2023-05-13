package w3school.oop

class Car3(var brand: String, var model: String, var year: Int){
    fun drive(){
        println("asdf")
    }
}

class Car4(var brand: String, var model: String, var year: Int) {
    // Class function
    fun drive() {
        println("Wrooom!")
    }

    // Class function with parameters
    fun speed(maxSpeed: Int) {
        println("Max speed is: " + maxSpeed)
    }
}

fun main(){
    val c1 = Car3("f","a",123)
    c1.drive()

    val c2 = Car4("Ford", "Mustang", 1969)

    // Call the functions
    c2.drive()
    c2.speed(200)

}