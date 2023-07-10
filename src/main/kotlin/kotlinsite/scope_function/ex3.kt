package kotlinsite.scope_function

data class Person2(var name:String, var age:Int =0 , var city:String = ""){
    fun changeAge(){age++}
}

/**
 * apply
 * apply를 사용하면 this나 it keyword없이 class의 변수나 method에 그냥 접근이 가능하다
 * context object를 return
 */

fun main(){
    val adam = Person2("adam").apply {
        age = 20
        city = "london"
        changeAge()
    }
    println(adam)
}