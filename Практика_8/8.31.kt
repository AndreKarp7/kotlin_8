package Практика_8
fun far(c:Double): Double {
    return 1.8 * c + 32.0
}
fun main(){
    print("celsium: ")
    val c = readln().toDouble()
    println("${c} celsium == ${far(c)} farenheit")
}