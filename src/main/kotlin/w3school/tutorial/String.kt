package w3school.tutorial

import java.util.*

/**
 * java와는 다르게 String을 굳이 작성할 필요는 없음-> 다만 이전에 했던 것처럼 타입을 적어야 새로운값이 할당됨.
 */
fun string1(){
    var greeting = "hello"

    var greeting2: String ="hello2"
    greeting2 = "hello3"
    println(greeting2)
}

/**
 *
 * Access a String
 * [index입력]를 통해서 index를 통해서 개별 element에 접근이 가능
 */
fun string2(){
    var txt = "hello world"
    println(txt[3].toString() + txt[4].toString()) //l0
}


/**
 * string의 길이는 length로 나타낸다.
 */
fun string3(){
    var txt = "asdfasdf"
    println("length of txt : " + txt.length)
}


/**
 * 자바와 동일하게 대소문자 변경
 * toUpperCase -> 대문자로! => uppercase 사용
 * toLowerCase -> 소문자로! => lowercase 사용
 */
fun string4(){
    var txt = "asdfasdf"
    println(txt.uppercase())
}

/**
 * Comparing Strings
 * compareTo(String) -> 비교할 때는 comporeTo를 사용한다.
 *  두 문자열을 하나하나씩 캐릭터 형으로 변환하고 아스키 코드로 비교한느 방식이고
 *  모든 문자의 차이가 0이 나오는 경우 0을 반환하기때문에 똑같은지 보려면 0이 나왔는지를 체크.
 */
fun string5(){

    var t1 = "asdf"
    var t2 = "asdf"
    println(t1.compareTo(t2))

}

/**
 * 문자열에서 특정 문자열을 포함할 때 그 index를 찾기
 * first occurrence 을 반환.
 * 그때 공백도 포함해서 체크하는 것은 당연!
 */
fun string6(){

    var txt = "asdf locate locate"
    println("string6 result : " + txt.indexOf("locate"))
}

/**
 * 문자열 합치기 concat
 * + 를 이용하거나 plus method를 사용한다.
 * plus의 경우, first.plus(last) -> first에 last를 더해주기에 순서주의
 */
fun string7(){
    println("asdf" + "gdfgsdfg")
    var f = "asdf"
    var l = "fdsa"
    println(f.plus(l))
}

/**
 * string templates
 *
 */
fun string8(){
    var f = "asdf"
    var l = "fdsa"
    println("$f $l") // asdf fdsa가 나와야함
}


fun main(){

    string1()
    string2()
    string3()
    string4()
    string5()
    string6()
    string7()
    string8()

}