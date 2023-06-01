package kotlinsite.controlflow

enum class Status{
    Expired, InProgress
}

fun main(){

    /**
     * 삼항 연산자인 condition ? then : else 의 삼항연산자가 존재하지 않음
     * if 표현식을 잘 활용한다!
     * 아래처럼 간단히 가능하고 else if 역시 표현이 가능하다
     */

    val a = readln().toInt()
    val b = readln().toInt()
    val maxLimit=1
    var maxOrLimit = if(maxLimit > a) maxLimit else if (a>b) a else b
    println(maxOrLimit)

    /**
     * 식은 표현식으로 분기 될 수 있으며 if문은 return을 포함하기 때문에 가능하다.
     * 다만, 값을 반환하거나 변수에 할당하는 경우, else는 필수!
     */

    val max = if(a>b){
        print("a>b")
        a
    }else{
        print("b>a")
        b
    }

    /**
     * when의 사용법
     * when(변수){ 변수의 값 -> 결과} 이때 변수에 else를 사용할 수 있다
     * 주로 Enum type과 함께 사용한다. 혹은 Boolean 정도?
     */
    when(readln().toInt()){
        1 -> println("x->1")
        2 -> println("x->2")
        else -> {
            print("x는 1도 2도 아님")
        }
    }

    val status = when(if(readln() == "Expired") Status.Expired else if(readln() == "InProgress") Status.InProgress else "존재하지 않음"){
        Status.Expired -> println("만료")
        Status.InProgress -> println("진행중")
        else -> {
            println("다시 입력")
        }
    }

    /**
     *is를 사용해 특정 유형을 체크할 수도 있다.
     */
    val x = readln()
    fun hasPrefix(x: Any) = when(x){
        is String -> x.startsWith("prefix")
        else -> false
    }

}