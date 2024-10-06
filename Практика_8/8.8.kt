import kotlin.math.min
fun fps(mins:Int, fps:Int): Int {
    return mins * fps * 60
}
fun main(){
    print("mins = ")
    var mins = readln().toInt()
    print("fps = ")
    var fps = readln().toInt()
    println(fps(mins, fps))
}
