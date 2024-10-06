package Практика_8
fun twoStrs(str1:String, str2:String):String {
    return str1 + str2
}
fun main(){
    print("str1 = ")
    var str1 = readln()
    print("str2 = ")
    var str2 = readln()
    println("Uppercase: " + twoStrs(str1, str2))
}