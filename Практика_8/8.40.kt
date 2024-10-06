package Практика_8
import kotlin.random.Random
fun arrCopy(arr:Array<Int>): Array<Int> {
    val copied:Array<Int> = arr
    return copied
}
fun main(){
    val arr = Array<Int>(15, { Random.nextInt(0, 50)})
    print("Your arr: ${arr.joinToString(", ")}\nCopied: ${arrCopy(arr).joinToString(", ")} ")
}