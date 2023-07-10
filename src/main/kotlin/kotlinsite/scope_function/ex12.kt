package kotlinsite.scope_function

/**
 * takeIf는 다른 함수를 연결할 대 반환값이 null을 허용하기 때문에 null검사를 수행하거나 안전한 호출을 사용해야한다.
 * ?.을 통해서 호출한다.
 *
 */
fun main(){
    val number = kotlin.random.Random.nextInt(100)

    val evenOrNull = number.takeIf { it%2==0 }
    val oddORNull = number.takeUnless { it%2==0 }
    println("even : $evenOrNull, odd: $oddORNull")


}