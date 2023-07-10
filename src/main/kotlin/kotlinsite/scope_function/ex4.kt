package kotlinsite.scope_function

import kotlin.random.Random

fun writeToLog(message: String){
    println("INFO : $message")
}

/**
 * also도 obejct를 반환해서 바로 return과 함께 사용해서 int로 값을 반환할 때 also를 사용했다.
 */

fun main(){
    fun getRandomInt(): Int{
        return Random.nextInt(100).also {
            writeToLog("getRandomInt() generated value $it")
        }
    }

    val i = getRandomInt()
    println(i)
}