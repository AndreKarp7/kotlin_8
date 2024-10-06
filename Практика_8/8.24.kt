package Практика_8
fun toUpper(str:String):String {
    return str.toUpperCase()
}
fun main(){
    print("str = ")
    var str = readln()
    println("Uppercase: " + toUpper(str))
}