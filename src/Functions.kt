fun main(args: Array<String>) {
    myFunction()
    println(helloFunction())
    functionWithParam("Calling the function of name functionWithParam")
    val list = listOf<Int>(1,5,7,9,10)
    val greaterThan6 = list.count({ number -> number > 6 })
    println(greaterThan6)
}
// void function
fun myFunction() {
    println("Hello World")
}

// has return
fun helloFunction(): String {
    return "helloFunction says: Hello World"
}

fun functionWithParam(phrase: String) {
    println(phrase)
}