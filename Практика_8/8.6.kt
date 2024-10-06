fun iff(a:Int, b:Int): Boolean {
    return when{
        a + b < 100 -> true
        else -> false
    }
}
fun main(){
    print("a = ")
    var a = readln().toInt()
    print("b = ")
    var b = readln().toInt()
    println(iff(a, b))
}
