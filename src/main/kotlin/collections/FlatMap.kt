package collections

/**
 * flatMap 사용하면 list안의 list를 모두 flat
 */

fun main(){

    val fruitsBag = listOf("apple","orange","banana","grapes")
    val clothesBag = listOf("shirts","pants","jeans")
    val cart = listOf(fruitsBag, clothesBag)
    val mapBag = cart.map { it }
    val flatMapBag = cart.flatMap { it }

    println("mapBag : $mapBag")
    println("flatMapBog : $flatMapBag")

}