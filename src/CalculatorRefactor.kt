fun main(args: Array<String>) {
    var number1: Double = 0.0
    var number2: Double = 0.0
    print("Enter number 1: ")
    number1 = readLine()!!.toDouble()
    print("Choose a mathematics operation - (+, -, *, /): ")
    val operation:String = readLine()!!
    print("Enter number 2: ")
    number2 = readLine()!!.toDouble()
    var result: Double = if (operation == "+") {
        sum(number1, number2)
    } else if (operation == "-") {
        subtraction(number1, number2)
    } else if (operation == "*") {
        multiplication(number1, number2)
    } else if (operation == "/") {
        division(number1, number2)
    } else {
        0.0
    }
    println("$number1 $operation $number2 = $result")
}

fun sum(number1: Double, number2: Double): Double {
    return number1 + number2
}
fun subtraction(number1: Double, number2: Double): Double  {
    return number1 - number2
}
fun multiplication(number1: Double, number2: Double): Double {
    return number1 * number2
}
fun division(number1: Double, number2: Double): Double {
    return number1 / number2
}
