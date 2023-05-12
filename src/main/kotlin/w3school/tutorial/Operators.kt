package w3school.tutorial


/**
 * % -> 나머지
 * / -> 몫
 *
 */
fun main(){

    var x = 10

    x +=5
    println(x)
    x %= 2
    println(x) // 나머지 -> 1

    var y = 16
    y /= 5
    println(y) // 몫 -> 3

    var z = 157
    var doubleY = z.toDouble() / 3 // dot type일 경우에 /는 몫이 아니라 나머지 기능을 수행한다.
    println(doubleY)
}