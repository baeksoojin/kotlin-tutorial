package kotlinsite.scope_function


/**
 * run function scope ->
 * this를 사용해서 범위안에서 표현이 가능하다.
 * this를 생략할 수 있다.
 *
 * this : 람다 수신자
 * it : 람다 인수
 *
 * run, let은 lambda 자체를 return
 */

fun main(){
    val str = "hello"

    str.run{
        println("the string's length : $length")
    }// this를 사용해서 범위안에서 표현이 가능하다.

    //let과의 차이점
    println("lambda return: "+ str.let{
        println("the string's length is ${it.length}")
    })
}