import kotlin.random.Random
fun difference(arr1: List<Int>, arr2: List<Int>):List<Int> {
    return arr1 + arr2
}
fun main(){
    var arr1 = List<Int>(10, { Random.nextInt(-50, 50)})
    var arr2 = List<Int>(10, { Random.nextInt(-50, 50)})
    println("Массивы:\n\t${arr1.joinToString(", ")}\n\t${arr2.joinToString(", ")}\nСоединили: \n\t${difference(arr1, arr2).joinToString(", ")}")
}