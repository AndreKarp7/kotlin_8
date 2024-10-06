fun bestOf2(a:Int, b:Int): Int {
    return when{
        a > b -> a
        else -> b
    }
}
fun main(){
    print("a = ")
    var a = readln().toInt()
    print("b = ")
    var b = readln().toInt()
    println("Max = ${bestOf2(a, b)}" )
}
