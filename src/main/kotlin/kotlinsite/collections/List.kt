package collections

/**
 * mutableList -> List에 원소 추가 : add
 * mutableList -> forEach를 통해서 value값을 뽑아냄
 *
 *
 */


val systemUsers: MutableList<Int> = mutableListOf(1,2,3)
val sudoers: List<Int> = systemUsers

fun addSystemUser(newUSer: Int){
    systemUsers.add(newUSer)
}

fun getSysSudoers(): List<Int>{
    return sudoers
}

fun main(){
    addSystemUser(4)
    println("Tot sudoers : ${getSysSudoers().size}") // size를 체크하는 것.  -> list에서 체크

    println("$sudoers")
    println("${sudoers[0]}")

    getSysSudoers().forEach { // forEach를 통해서 value값을 뽑아냄
        i -> println("Some useful into on user $i, ${sudoers[i-1]}")
    }
}