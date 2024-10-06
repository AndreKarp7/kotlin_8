package Практика_8
import kotlin.random.Random
fun lastElement(arr:Array<Int>):Int{
    return arr.last()
}
fun main(){
    val arr = Array<Int>(15, {Random.nextInt(0, 50)})
    println("Your array:${arr.joinToString(", ")}\nLast element: ${lastElement(arr)}")
}