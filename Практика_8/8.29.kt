package Практика_8
import kotlin.random.Random
fun minMax(arr:Array<Int>): Pair<Int, Int> = arr.max() to arr.min()
fun main(){
    val arr = Array<Int>(15, { Random.nextInt(0, 50)})
    println("Your arr${arr.joinToString(", ")}\nMax, min: ${minMax(arr)}")
}