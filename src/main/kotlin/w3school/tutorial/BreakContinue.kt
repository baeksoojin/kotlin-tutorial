package w3school.tutorial

fun main(){

    var i:Int = 0
    while( i < 10){
        println(i)
        i++
        if (i==4){
            break
        }
    }

    i = 0
    while( i<10){
        if(i==4){
            i++
            continue
        }
        println(i)
        i++

    }




}