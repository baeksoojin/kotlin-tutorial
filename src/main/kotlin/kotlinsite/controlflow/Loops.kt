package controlflow


fun printNum(){

    val nums = listOf("1","2","3")

    for (num in nums){
        println("$num")
    }

}

fun doWhile(){

    var num1 = 0
    var num2 = 0

    while(num1<5){
        num1++
        println("while / num1 : $num1 , num2 : $num2")
    }

    do{
        num2++
        println("do while / num1 : $num1 , num2 : $num2")
    }while(num2 < 5)

}

class Animal(val name: String)

class Zoo(val animals: List<Animal>){
    operator  fun iterator(): Iterator<Animal>{
        return animals.iterator()
    }
}

fun main(args: Array<String>){

    printNum()
    doWhile()

    val zoo = Zoo(listOf(Animal("a1"), Animal("a2")))
    for(animal in zoo){
        println("${animal.name}")
    }

}

