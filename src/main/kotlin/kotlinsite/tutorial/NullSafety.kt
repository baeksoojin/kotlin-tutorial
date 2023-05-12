package tutorial

fun main(){

    // null을 사용하기 위해서 ?를 변수 타입 뒤에 붙여줘서 java에서의 Optional처럼 사용한다.

    var neverNull: String = "null 불가능"
    //neverNull = null -> exception

    var nullable: String? = "?를 사용해서 null 가능"
    nullable = null

    var inferredNonNull = "type과함께 ?를 적지 않는다면 OPTIONAL처럼 적용불가능 -> null로 판단한다"
    //inferredNonNull = null -> exception

    fun strLength(notNull: String): Int{
        return notNull.length;
    }

    println(strLength(neverNull))
    //strLength(nullable) -> exception

}



