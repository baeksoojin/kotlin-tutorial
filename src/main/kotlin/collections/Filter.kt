package collections

val numbers = listOf(1, -2, 3, -4, 5, -6)
val positive = numbers.filter { x -> x>0 }
val negatives = numbers.filter { it < 0 }

fun main(){
    println(positive)
    println(negatives)
}