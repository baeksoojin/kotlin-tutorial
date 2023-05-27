package baekjoon.basic

fun main(args: Array<String>){
    val n : Int = readln().toInt()
    for(i in 0 until n){
        for(j in 0..i){
            print("*")
        }
        println()
    }
}