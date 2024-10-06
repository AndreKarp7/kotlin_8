import kotlin.random.Random
fun indexOfFirstOccurrence(arr: Array<Int>, a: Int): Int {
    for (i in arr.indices) {
        if (arr[i] == a) {
            return i
        }
    }
    return -1
}
fun main() {
    val arr = Array<Int>(15, { Random.nextInt(0, 50)})
    print("Your arr: ${arr.joinToString(", ")}\nTarget = ")
    val target = readln().toInt()
    val index = indexOfFirstOccurrence(arr, target)
    if (index != -1) {
        println("Индекс вхождения первого элемента $target: $index")
    } else {
        println("Элемент $target в массиве не найден.")
    }
}