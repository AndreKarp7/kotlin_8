import kotlin.random.Random
fun difference(arr: List<Int>):Int {
    return arr.max() - arr.min()
}
fun main(){
    var arr = List<Int>(10, { Random.nextInt(-50, 50)})
    println("Массив: ${arr.joinToString(", ")}\nРазница ${arr.max()} и ${arr.min()}: ${difference(arr)}")
}