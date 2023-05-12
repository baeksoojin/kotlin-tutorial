package collections

/**
 * mutableSet -> add로 원소를 추가하고 그 결과가 true, false가 나옴.
 * set이니까 중복된 원소라면 false가 나옴. -> run time error x !
 */

val openIssue: MutableSet<String> = mutableSetOf("1","2","3")

fun addIssue(uniqueDesc: String): Boolean{
    return openIssue.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String{
    return if (isAdded) "correct" else "rejected"
}

fun main(){
    val aNewIssue: String = "4"
    val anIssueAlreadyIn: String = "2"

    println("issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")
}