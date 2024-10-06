package Практика_8
fun chetOrNot(a: Int): Boolean {
    return a % 2 == 0
}
fun main(){
    print("a = ")
    var a = readln().toInt()
    println("A чётное?: ${chetOrNot(a)}")
}