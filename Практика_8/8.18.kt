package Практика_8
fun isPrime(a: Int): Boolean {
    for (i in 2..a / 2) if (a % i == 0) return false
    return true
}
fun main(){
    print("a = ")
    val a = readln().toInt()
    println("a is prime: ${isPrime(a)}")
}