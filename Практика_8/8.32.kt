package Практика_8
fun reverse(str:String):String{
    return str.reversed()
}
fun main(){
    print("str = ")
    val str = readln()
    println(reverse(str))
}