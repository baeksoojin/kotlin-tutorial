package collections

/**
 * java hashmap 의 개념으로 key, value로 구성.
 * key to value -> key와 value값을 넣을 수 있음. 당연히 초기화할때는 key, value 모두에 대한 type이 필요함.
 *
 */

const val PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
val EZPassReport: Map<Int, Int> = EZPassAccounts

fun updatePointsCredit(id: Int){
    if(EZPassAccounts.containsKey(id)){
        println("updating $id")
        EZPassAccounts[id] = EZPassAccounts.getValue(id) + PASS
    }else{
        println("error : id: $id")
    }
}

fun accountsReport(){
    println("EZ-Pass report:")
    EZPassReport.forEach{
        k, v -> println("key $k: value $v")
    }
}

fun main(){
    accountsReport() // 1
    updatePointsCredit(1) // 100
    updatePointsCredit(1) // 100
    updatePointsCredit(5) // error print
    accountsReport()
}