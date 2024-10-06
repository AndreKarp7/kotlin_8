package Практика_8
import kotlin.random.Random
fun createArray(n:Int):Array<Int>{
    return Array<Int>(n, {Random.nextInt(0, 100)})
}
fun main(){
    print("Lenght of array: ")
    val a = readln().toInt()
    println(createArray(a).joinToString(", "))
}