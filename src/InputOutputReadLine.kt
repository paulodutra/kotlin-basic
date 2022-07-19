fun main (args: Array<String>) {
    val name: String
    val age: Int
    print("Enter your name: ")
    name = readLine()!!
    print("How old are you ? ")
    age= readLine()!!.toInt()
    println("Your name is $name and you have $age years old. Your name have ${name.length} characters")
}