package w3school.tutorial

/**
 * for문을 돌릴 때 Index를 통해서 1씩 증가시키면서 돌게끔 해줘도 되지만
 * '..'을 사용해서 범위를 지정해서 range를 사용할 수 있다.
 *
 * Ragne -> ..으로 표현
 *
 * 특징 ) 처음과 끝을 모두 포함하면서 그 사이의 값이 범위안에 들어감
 *
 */
fun range1(){
    for(chars in 'a'..'x'){
        println(chars)
    }

    for(nums in 5..15){
        println(nums)
    }
}

/**
 * in을 사용해서 범위 안의 값을 체크가능
 */
fun range2(){

    val nums = arrayOf(2,3,4)
    if(2 in nums){
        println("존재")
    }else{
        println("존재안함")
    }
}

/**
 *
 * break continue 를 Range와 함께 작성
 *
 */

fun range3(){
    for(nums in 5..10){
        if(nums == 10){
            break
        }
        if(nums == 7){
            continue
        }
        println(nums)
    }
}

fun main(){
    range1()
    range2()
    range3()
}