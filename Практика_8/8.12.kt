fun google(count:Int): String {
    return "G" + "o".repeat(count) + "gle"
}
fun main(){
    print("count of 'o'= ")
    var count = readln().toInt()
    println(google(count))
}
