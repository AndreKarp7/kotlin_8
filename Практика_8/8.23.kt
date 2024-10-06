package Практика_8
fun countOfSyms(str:String):Int {
    var count:Int = 0
    for (a in str) count++
    return count
}
fun main(){
    print("str = ")
    var str = readln()
    println("Count of syms: " + countOfSyms(str))
}