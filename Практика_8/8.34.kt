package Практика_8
fun replaceSpace(str:String?):String{
    return str!!.replace(" ", "")
}
fun main(){
    print("str = ")
    val str = readLine()
    println("Without spaces: ${replaceSpace(str)}")
}