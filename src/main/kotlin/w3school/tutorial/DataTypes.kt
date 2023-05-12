package w3school.tutorial

/**
 * 1. 유형 살펴보기
 */

fun dataTypes(){
    val myNum = 5             // Int
    val myDoubleNum = 5.99    // Double
    val myLetter = 'D'        // Char
    val myBoolean = true      // Boolean
    val myText = "Hello"      // String
}


/**
 * 2. 유형 살펴보기
 */

fun dataTypes2(){

    val myNum: Int = 5         // Int
    val myDoubleNum: Double = 5.99    // Double
    val myLetter: Char = 'D'        // Char
    val myBoolean: Boolean = true      // Boolean
    val myText: String = "Hello"      // String

}

/**
 * 3. integer type
 */

fun integerType() {

    //1. byte -> 1바이트
    val myNum: Byte = 100

    //2.short -> 2바이트
    val myNumShort: Short = 5000

    //3.int -> 4바이트
    val myNumInt: Int = 2130000000

    //4. long -> 8바이트
    val myNumLong: Long = 1234123412341243L

    print(myNum)
    print(myNumShort)
    print(myNumInt)
    print(myNumLong)

}

/**
 * point type
 * float -> 6-7까지 가능
 * double -> F로 작성을 해야하며 15 digit까지 가능. -> safer -> 안전하게 하려면 double을 작성한다.
 */

fun floatingPointType(){

    val num1: Float = 5.57F

    val num2: Double = 19.99

    println(num1 + num2)
}

/**
 * scientific numbers
 * e or E로 power of 10
 */

fun scientificNumbers(){
    val num1: Float = 35E3F
    val num2: Double = 12E4

    println(num1 + num2)
}

/**
 * Others
 * boolean -> true or false로 모두 소문자
 * char -> '' : 자바처럼 string이랑 구분.
 */

fun otherTypes(){


    val isA: Boolean = true

    if(!isA){ // isA == false -> boolean expression can be simplified
        print("is ture")
    }else{
        print("is false")
    }

    val grade: Char = 'B'
    println(grade)

}

/**
 *
 * Strings
 * https://kotlinlang.org/docs/strings.html kotlin v1.8.21 사이트 참고
 * Java에서의 문자열에서는 concat or contains or replaceAll or substring 등이 존재했는데 확실히 문자열 조작에서는 더 쉬워진 느낌
 *

 */

fun strings(){

    // type : String
    val text:String = "HelloWorld"

    println(text)

    //kotlin site 따라하기
    val str = "asdf 124"
    for( c in str){
        println(c)
    }

    println("str.uppercase " + str.uppercase()) // toUpperCase (java)
    println(str)

    val s:String = "asd"// 문자열 연결을 +를 통해서 연결한다.
    println(s + "efg")

    //string literals

    val s2 = "hello, world!\n"
    val text2 = """
        for ( c in "foo") print(c)
    """.trimIndent()

    print(s2 + text2)

    val i = 10
    println("i = $i")

    val j = "asdf"
    println("$j.length is ${j.length}")

}


/**
 * toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble(), toChar()
 */
fun casting(){
//    val x: Int = 5
//    val y: Long = x -> type mismatch

    //type conversion
    val x: Int = 5
    val y: Long = x.toLong()
    println(y)
}

fun main(){
    dataTypes()
    dataTypes2()
    integerType()
    floatingPointType()
    scientificNumbers()
    otherTypes()
    strings()
    casting()
}

