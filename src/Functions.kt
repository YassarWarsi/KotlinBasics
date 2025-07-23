
fun sum(x :Int , y: Int) : Int {
    return x+y
}

fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message")
}


fun dpv(message: String, prefix: String = "INFO"){
    println("[$prefix] $message")
}

fun main() {

    println("Sum:")
    println (sum(7,8))

    // Uses named arguments with swapped parameter order
    printMessageWithPrefix(prefix = "Log", message = "Hello")

    println("DEFAULT PARAMETER VALUES")

    dpv("Just checking")
    dpv("Now with both parameters","LOG")
    dpv(prefix = "Log", message = "explicitly swapped params")
    dpv("message1")

}