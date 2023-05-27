package baekjoon.basic

fun main(args: Array<String>){
    val n = readln().toInt()
    for(i in 0 until n){
        for(j in n-i-1 downTo 0) print("*")
        println()
    }
}