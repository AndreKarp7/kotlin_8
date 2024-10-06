fun pows(n:Double, k:Double): Boolean {
    return when{
        Math.pow(k, k) == n -> true
        else -> false
    }
}
fun main(){
    print("n = ")
    var n = readln().toDouble()
    print("k = ")
    var k = readln().toDouble()
    println(pows(n, k))
}
