package tutorial

class MutableStack<E>(vararg items:E){

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size-1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main(){
    val stack = MutableStack(0.62, 3.14, 2.7)
    println(stack.pop()) // stack 이기에 lifo 구조를 가짐. 2.7이 뽑힘
    println(stack.peek()) // .last를 사용하면 toMutableList() 의 가장 마지막 값을 뽑음
    println(stack.isEmpty())
    println(stack.size())
    println(stack.push(3.28484)) // 동일하게 Double값을 저장
    println(stack.toString()) // MutableStack(0.62, 3.14, 3.28484)이 결과로 나옴을 확인가능

    val stack2 = mutableStackOf(0.62, 3.14, 2.7)
    println(stack2.toString())

}