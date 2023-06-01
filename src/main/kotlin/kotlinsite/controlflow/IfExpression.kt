package kotlinsite.controlflow

fun main(){

    /**
     * 삼항 연산자인 condition ? then : else 의 삼항연산자가 존재하지 않음
     * if 표현식을 잘 활용한다!
     * 아래처럼 간단히 가능하고 else if 역시 표현이 가능하다
     */

    val a = readln().toInt()
    val b = readln().toInt()
    val maxLimit=1
    var maxOrLimit = if(maxLimit > a) maxLimit else if (a>b) a else b
    println(maxOrLimit)
}