package controlflow

fun intRange(){
    for(i in 0..3){
        print(i)
    }
    print(" ")

    for(i in 0 until 3){
        print(i)
    }// until의 경우 마지막 Index는 포함하지 않는다.
    print(" ")

    for (i in 2..8 step 2) {
        print(i)
    }
    print(" ")

    for(i in 3 downTo 0){
        print(i)
    }
    print(" ")
}

fun charRange(){
    for(c in 'a'..'d'){
        print(c)
    }
    print(" ")

    for(c in 'z' downTo 'a' step 3){
        print(c)
    }
    print(" ")
}

fun rangeUseWithIf(){
    val x = 2
    println()
    if (x in 1..5){
        print("x is in range 1<=x<=5")
    }
    println()
    if(x !in 6..10){
        print("x is not in range 6<=x<=10")
    }
}

fun main(){

    intRange()
    charRange()
    rangeUseWithIf()
}

/**
 * (점 2개)..을 사용해 range를 표현한다. 이때 마지막 index 포함
 * util을 사용하여 마지막 index를 제외하고 그 사잇값을  범위로 한다.
 */