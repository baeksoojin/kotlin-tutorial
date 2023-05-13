package w3school.tutorial

fun fun1(){
    println("fun1")
}



fun fun2(name:String){
    println("fun2")
    println("name : " + name)
}

/**
 *
 * parameter의 경우 여러개도 가능하고 변수이름을 먼저적고 type을 적는다
 */
fun fun3(fname: String, age:Int){
    println(fname + " is " + age)
}

/**
 *
 * return type의 경우 function()바로 뒤에  ':' 을 사용해서 구분한다.
 */

fun fun4(x: Int): Int{
    return x+3
}

/**
 * 함수의 Shortest 축약형 표현을 살펴보자!! => return 값을 나타낼때 '='으로 구분하여 나타낸다.
 */
fun fun5(x: Int, y: Int) = x+y

fun main(){
    println("main function")
    fun2("asdf")
    fun3("asdf", 30)
    println(fun4(4))
    println( fun5(3,4))
}