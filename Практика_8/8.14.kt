fun sumOf2Nums(a:Int, b:Int): Int {
    return a + b
}
fun main(){
    print("a = ")
    var a = readln().toInt()
    print("b = ")
    var b = readln().toInt()
    println("Result = ${sumOf2Nums(a, b)}" )
}
