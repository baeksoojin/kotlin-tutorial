package kotlinsite.controlflow

fun main(){
    /**
     * python에서 for i in ~~ 와 같은 식으로 사용가능
     * in을 사용하여 항목을 바로 사용한다
     */

    val exCollection = listOf<Char>('a','b')
    for( item in exCollection) print(item)

    /**
     * 범위 표현식에서 ".."을 사용하는 경우, 앞의 숫자부터 뒤의 숫자까지의 숫자를 돈다.
     * 만약에 until을 사용한다면 가장 마지막 숫자는 포함하지 않는다.
     * downTo, step 등을 사용해 역전, step을 가져간다.
     */

    for(i in 1..3) println(i)
    for(i in 6 downTo 0 step 3) println(i)

}