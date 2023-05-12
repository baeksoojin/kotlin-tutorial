package collections

import java.util.NoSuchElementException

/**
 * key의 value값에 접근 -> key를 사용해야하는데 "[]"를 사용할 때는 key값이 없으면 null이 뜨지만
 * getValue를 사용할 때는 NoSuchElementException 뜨기 때문에 try-catch 사용
 *
 *
 * key값에 따라서 withDefault로 디폴트 값을 설정 가능.
 * mapWithDefault이기에 값이 없는 경우에만 해당됨.
 *
 */

fun main(args: Array<String>){
    val map = mapOf("Key" to 42)

    val value1 = map["Key"] // 42
    val value2 = map["key2"] // null이라고 뜸.
    val value3 = map.getValue("Key")

    val mapWithDefault = map.withDefault { k -> k.length }
    val value4 = mapWithDefault.getValue("key2")
    print("")

    try{
        map.getValue("anotherKey")
    }catch (e: NoSuchElementException){
        println("Message : $e")
    }

}