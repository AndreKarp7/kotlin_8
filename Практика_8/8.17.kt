package package8

fun factorial(n: Int): Int {
    require(n >= 0) { "n must be positive" }
    return if (n <= 1) {
        1
    } else {
        n * factorial(n - 1)
    }
}
fun main(){
    print("n = ")
    var n = readln().toInt()
    println("factorial n = ${factorial(n)}")
}