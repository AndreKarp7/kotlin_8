import kotlin.random.Random
fun sort(arr: Array<Int>):Array<Int> {
    return arr.sortedArray()
}
fun main(){
    var arr = Array<Int>(10, { Random.nextInt(-50, 50)})
    println("Массив: ${arr.joinToString(", ")}\nSorted: ${sort(arr).joinToString(", ")}")
}