package kotlinsite.scope_function


/**
 * with구문
 *
 * this를 사용하고 lambda를 반환값으로 가진다.
 * 그렇지만, 다른 점은 (run과는 동일함) this.이나 it.과 같이 아예 속성에 접근할 때도 지시자를 붙여주지 않아도 된다.
 */

fun main(){
    val numbers = mutableListOf("one","two","three")
   with(numbers){
        println("with is called with argument $this")
        println("it contains $size elements")
    }

    val firstAndLast = with(numbers){
        "the first element is ${first()}" + "the last element is ${last()}"
    }
    print(firstAndLast)
}