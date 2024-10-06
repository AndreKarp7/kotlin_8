fun repeatFunc(txt:String, count:Int): String {
    return txt.repeat(count)
}
fun main(){
    print("txt = ")
    var txt = readln()
    print("count = ")
    var count = readln().toInt()
    println(repeatFunc(txt, count))
}
