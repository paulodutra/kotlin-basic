import java.util.Scanner

fun main (args: Array<String>) {
    val name: String
    val age: Int
    val input = Scanner(System.`in`)
    print("Enter your name: ")
    name = input.next()
    print("How old are you ? ")
    age= input.nextInt()
    println("Your name is $name and you have $age years old. Your name have ${name.length} characters")
}