package w3school.tutorial

/**
 * var variableName = value
 * val variableName = value
 */

fun variables(){

    var name = "sujin"
    val birthyear = 2000

    println(name)
    println(birthyear)

}


/**
 * 나중에 값을 할당하려면 -> type이 있을 때만 가능
 */

fun variableType(){

    var name: String
    name = "John"
    println(name)

}

/**
 * 변경가능성
 * val을 사용하면 값을 변경/재할당 불가능
 * var을 사용하면 값을 변경/재할당 가능
 *
 * val의 경우 final처럼 (static처럼) 불변하는 값에서 사용할 것
 *
 */

fun keywordVal(){
    val name = "sujin"
    //재할당 불가능 -> name = "asdf" -> error
    println(name)

    var name2 = "sujin"
    name2 = "asdf"
    println(name2)
}

fun main(){

    variables()
    variableType()
    keywordVal()

}
