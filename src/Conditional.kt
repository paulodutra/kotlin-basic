fun main(args: Array<String>) {
    val number1: Int = 10
    val number2: Int = 20
    //val max: Int = if(number1 > number2) number1 else number2
    val max: Int = if(number1 > number2) {
        println("Block 1")
        number1
    } else {
        println("Block 2")
        number2
    }
    println(max)

    if (number1 <  number2) {
        println("number 1 is smaller than number 2")
    } else {
        println("number 2 is smaller than number 1 ")
    }

    //when similar switch
    when(number1) {
        1  -> println("1")
        2  -> println("2")
        10 -> println("10")
        else -> {
            println("no options")
        }
    }


}