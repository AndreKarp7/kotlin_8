package Практика_8
import kotlin.random.Random
fun reverseArray(arr:Array<Int>):Array<Int>{
    return arr.reversedArray()
}
fun main(){
    val arr = Array<Int>(15, { Random.nextInt(0, 50)})
    print("Your arr: ${arr.joinToString(", ")}\nReversed: ${reverseArray(arr).joinToString(", ")} ")
}