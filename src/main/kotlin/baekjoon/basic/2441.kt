package baekjoon.basic

fun main(args: Array<String>){
    val n = readln().toInt()

    for(i in 0 until n){
        for(j in 0 until i) print(" ")
        for(j in 0 until n-i) print("*")
        println()
    }
}