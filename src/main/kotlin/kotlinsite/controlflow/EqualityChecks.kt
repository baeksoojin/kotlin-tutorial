package controlflow

/**
 * 값의 비교와 참조 비교  ex) java에서 equals와 ==의 차이처럼 생각하기
 * call by reference ->  "===" (서로 다른 객체일경우에 그 안의 value값이 같다고 하더라도 false) : java에서의 == 처럼 생각할 것
 * call by value ->  "==" (서로 다른 객체이더라도 그 안의 value만 비교) : java에서의 equals처럼 생각할 것.
 * => 프로그램에서 값을 비교하는 경우가 대부분일 것이기에, call by value를 사용하는 것이 아무래도 논리 오류를 피하게 될 것으로 보임.
 *
 */

fun main(){

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers) // value값 자체를 비교 -> set은 순서가 없기 때문에 당연히 동일 -> true
    println(authors === writers) // 서로 다른 객체(서로 다른 주소값)이기에 당연히 false
}

