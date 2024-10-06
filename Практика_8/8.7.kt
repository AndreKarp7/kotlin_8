fun delenNa100(a:Int): Boolean {
    return when{
        a % 100 == 0 -> true
        else -> false
    }
}
fun main(){
    print("a = ")
    var a = readln().toInt()
    println(delenNa100(a))
}
