package kotlinsite.scope_function

/**
 * let
 *
 *   // person = new Persion("asdf,20,"seoul")을 하고
 *     // person.moveTo()
 *     // person.incrementAge()
 *     // 를 한 것과 동일하다.
 *
 *  가독성이 높아지고 person을 it으로 대체하여 작성할 수 있다.
 */

data class Person(var name: String, var age: Int, var city: String){
    fun moveTo(newCity: String){ city = newCity}
    fun incrementAge(){age++}
}

fun main(){

    Person("asdf", 20, "seoul").let{
        println(it)
        it.moveTo("busan")
        it.incrementAge()
        println(it)
    }

}