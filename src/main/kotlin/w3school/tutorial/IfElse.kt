package w3school.tutorial

fun main(){

    //java와 동일한 부분
    if(20>19){
        println("20이 더 큼")
    }

    val x = 20
    val y = 18
    if ( x> y) {
        println("x가 y보다 큼")
    }

    val time = 20

    if(time < 18){
        println("good day")
    }else{
        println("good evening")
    }

    val temp = 22
    if(temp < 10){
        println("good morning")
    }else if(time < 20){
        println("good day")
    }else{
        println("good evening")
    }

    // kotlin에서의 Expression
    val z = 20
    val g = if(z < 30){
        "good"
    }else{
        "bad"
    }
    println(g)

    val hello = if (time < 21) "21보다 작음" else "21보다 큼"
    println(hello)

}