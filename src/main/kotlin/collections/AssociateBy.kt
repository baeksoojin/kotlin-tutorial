package collections

fun main(){

    data class Person(val name: String, val city: String, val phone: String)

    val people = listOf<Person>(
        Person("John", "Boston", "+1-888-123456"),
        Person("Sarah", "Munich", "+49-777-789123"),
        Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
        Person("Vasilisa", "Saint-Petersburg", "+7-999-123456"))

    val phoneBook = people.associateBy { it.phone }
    val phoneBook2 = people.associateBy ( Person::phone )
    val cityBook = people.associateBy ( Person::phone, Person::city )
    val peopleCities = people.groupBy ( Person::city, Person::name) // city group으로 설정. city를 기준으로 name을 구분.
    val lastPersonCity = people.associateBy ( Person::city, Person::name )

    println("People: $people \n")
    println("Phone book: $phoneBook \n")
    println("Phone book2 : $phoneBook2 \n")
    println("City book: $cityBook \n")
    println("People living in each city: $peopleCities \n")
    println("Last person living in each city: $lastPersonCity \n")

}