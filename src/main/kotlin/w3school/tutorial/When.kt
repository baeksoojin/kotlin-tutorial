package w3school.tutorial


/**
 * when을 사용해서 변하지 않는 케이스들의 집합이 있다면 가독성을 높임
 */
fun main(){

    val day = 4

    val result = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)

}