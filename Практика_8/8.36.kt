package Практика_8
fun stroka(str1:String, str2:String):Boolean{
    return if (str2 in str1) true else false
}
fun main(){
    println("str1 = ")
    val str1 = readln()
    println("str2 = ")
    val str2 = readln()
    println("str2 in str1?: ${stroka(str1, str2)}")
}