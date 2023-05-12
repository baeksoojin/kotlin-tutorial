package w3school.tutorial

fun main(){

    val temp = arrayOf("a","b","c","d")
    println(temp[0])

    temp[0] = "asdf"

    println(temp[0])
    println(temp.size)
    if("b" in temp) {
        println("b가 존재")
    }

    for(x in temp){
        println(x)
    }

}