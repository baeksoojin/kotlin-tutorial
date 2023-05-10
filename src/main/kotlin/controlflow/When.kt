package controlflow

fun main(){
    cases("2")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")

}

fun cases(obj: Any) {

    when(obj){
        1 -> println("1")
        "2" -> println("2")
        is Long -> println("3")
        !is String -> println("4")
        else -> println("unknown")
    }
}



class MyClass