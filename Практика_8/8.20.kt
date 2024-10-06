import kotlin.random.Random
fun maxOfArr(arr: Array<Int>):Int {
    return arr.max()
}
fun main(){
    var arr = Array<Int>(10, { Random.nextInt(-50, 50)})
    println("Массив: ${arr.joinToString(", ")}\nMax: ${maxOfArr(arr)}")
}