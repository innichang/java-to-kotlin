package study

fun main() {
    //a can be initialized like this
    var a: String? = null

    /*
    Kotlin is a language made for null safety. So is there a reason to forcefully initialize
    a variable with a forced 'null' value?

    I think not.... It's really bad...
     */
//    println("a는 $a")

    //Try to use lateinit
    lateinit var b: String

    val result1 = 30

    b = "Result: $result1"
    println(b)

    val result2 = 50
    b = "Result: ${result1 + result2}"
    println(b)
}