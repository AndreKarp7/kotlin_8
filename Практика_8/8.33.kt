package Практика_8
import kotlin.random.Random
fun findByIndex(i:Int, arr:Array<Int>):Int{
    return arr[i]
}
fun main(){
    val arr = Array<Int>(15, { Random.nextInt(0, 50)})
    print("Your arr: ${arr.joinToString(", ")}\nWrite index: ")
    val i = readln().toInt()
    println("Your number by index: ${findByIndex(i, arr)}")
}