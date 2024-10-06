package Практика_8
fun isPalindrom(str: String): Boolean {
    return if (str.reversed() == str) true else false
}
fun main(){
    print("str = ")
    var str = readln()
    println("Your str is palindrome?: " + isPalindrom(str))
}