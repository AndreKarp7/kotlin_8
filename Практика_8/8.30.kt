package Практика_8
fun summ(n:Int):Int{
    var sum = 0
    for (a in 1..n) sum += a
    return sum
}
fun main(){
    print("n = ")
    val n = readln().toInt()
    println("Sum from 1 to $n = ${summ(n)}")
}