package Практика_8
fun naturalNums(n:Int):Int{
    var sum = 0
    for (i in 1..n) sum += i
    return sum
}
fun main(){
    print("n = ")
    val n = readln().toInt()
    println("Sum of natural nums: ${naturalNums(n)}")
}