fun main (args: Array<String>) {
    var number1: Double
    var number2: Double
    print("Enter number 1: ")
    number1 = readLine()!!.toDouble()
    print("What you need ? (+, -, *, /) ")
    val op: String = readLine()!!
    print("Enter number 2: ")
    number2 = readLine()!!.toDouble()
    var result = 0.0
    when(op) {
        "+"  -> result = number1 + number2
        "-"  -> result = number1 - number2
        "*"  -> result = number1 * number2
        "/"  -> result = number1 / number2
        else -> println("invalid operation")
    }
    println("$number1 $op $number2 = $result")
}