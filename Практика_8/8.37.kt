package Практика_8
fun tabl(a:Int){
    for (i in 1..10) print("$a * $i = ${a*i}\n")
}
fun main(){
    print("a = ")
    val a = readln().toInt()
    tabl(a)
}