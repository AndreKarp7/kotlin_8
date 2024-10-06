package Практика_8
fun vowels(str:String):Int{
    var sum:Int = 0
    for (s in str){
        when(s){
            'a', 'e', 'o', 'i', 'u', 'y' -> sum++
        }
    }
    return sum
}
fun main(){
    print("str = ")
    val str = readln()
    println("Vowels in str = ${vowels(str)}")
}
