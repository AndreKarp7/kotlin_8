package Практика_8
import kotlin.random.Random
fun isContain(arr:Array<Int>, a:Int):Boolean{
    return if(a in arr) true else false
}
fun main(){
    val arr = Array<Int>(15, { Random.nextInt(0, 50)})
    print("Your array: ${arr.joinToString(", ")}\na = ")
    var a = readln().toInt()
    println("Is your array contain $a: ${isContain(arr, a)}")
}