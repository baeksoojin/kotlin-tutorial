package specialclasses

enum class State{
    IDLE, RUNNING, FINISHED
} // 유한한 특정 값들을 가지고 있다면 enum을 사용한다. - 개념은 Java와 동일

enum class Color(val rgv: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun printRed(){
        println(this.rgv)
    }

    fun containsRed() = (this.rgv and 0xFF0000 != 0 )
}

fun main(){
    val state = State.RUNNING
    val message = when (state){
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)

    val red = Color.RED
    println(red)
    println(red.containsRed())

    red.printRed()
    Color.BLUE.printRed()

    println(Color.BLUE.containsRed())
    println(Color.YELLOW.containsRed())

}