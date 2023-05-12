package specialclasses

data class User(val name: String, val id: Int){
    override fun equals(other: Any?) =
        other is User && other.id == this.id
}

fun main(){
    val user = User("usera", 1)
    println(user)

    val secondUser = User("usera", 1)
    val thirdUser = User("userb", 2)

    println("user == secondUser: ${user ==secondUser}")
    println("user == thridUser: ${user == thirdUser}")

    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    println(user.copy())
    println(user === user.copy())// copy는 새로운 객체를 만드는 것이기에 ===으로 비교하면 참조비교 -> false
    println(user.copy("userb"))
    println(user.copy(id = 3))

    println("name = ${user.component1()}")    // class의 속성에 접근하려면 component를 사용한다.
    println("id = ${user.component2()}")

}
