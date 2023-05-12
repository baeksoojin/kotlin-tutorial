package controlflow


/**
 * 구문) condition ? then : else
 */

fun max(a: Int, b: Int) = if (a > b) a else b         // 1
fun min(a: Int, b: Int) = if (a < b) a else b

fun main(){
    println("max : " + max(3,5))
    println("min : " + min(3,5))
}