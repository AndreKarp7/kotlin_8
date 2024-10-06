import kotlin.random.Random
fun sumOfArr(arr: Array<Int>):Int {
    return arr.sum()
}
fun main(){
    var arr = Array<Int>(10, { Random.nextInt(-50, 50)})
    println("Массив: ${arr.joinToString(", ")}\nСумма: ${sumOfArr(arr)}")
}