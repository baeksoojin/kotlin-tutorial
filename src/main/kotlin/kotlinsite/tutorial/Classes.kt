package tutorial

class Customer

class Contact(val id: Int, var email: String)

fun main(){

    // 자바에서 new를 통해서 생성하는 과정없이 파이썬에서 클래스를 사용하듯 사용하면 됨. 다만, 항상 그렇듯 인식할 수 있도록 val 붙이기
    val customer = Customer()

    val contact = Contact(1,"asdf.com")

    println(contact.id)
    contact.email = "asdfffff.com"
    println(contact.email)

}

