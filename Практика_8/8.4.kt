fun func(prob: Double, prize: Double, pay: Double): Boolean {
    return when{
        prob * prize > pay -> true
        else -> false
    }
}
fun main(){
    print("prob = ")
    var prob = readln().toDouble()
    print("prize = ")
    var prize = readln().toDouble()
    print("pay = ")
    var pay = readln().toDouble()
    println(func(prob, prize, pay))
}
