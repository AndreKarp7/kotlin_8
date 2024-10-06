import kotlin.random.Random
fun calculate(arr: List<Int>):Int {
    return arr.sum()
}
fun main(){
    var arr = List<Int>(10, { Random.nextInt(-50, 50)})
    println("Массив: ${arr.joinToString(", ")}\nСумма: ${calculate(arr)}")
}