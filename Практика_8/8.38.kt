package Практика_8
fun lenght(str:String):Int{
    return str.indices.last + 1
}
fun main(){
    print("str = ")
    val str = readln()
    println("Lenght of str = ${lenght(str)}")
}