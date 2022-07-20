fun main (args: Array<String>) {
    print("Enter with your Weight: ")
    val weight = readLine()!!.toDouble()
    print("Enter with your Height: ")
    val height = readLine()!!.toDouble()
    checkImc(weight, height)
}

fun checkImc(weight: Double, height: Double) {
    var result = weight / (height * height)
    if(result > 25) {
        println("Overweight")
    } else {
        println("Normal Weight")
    }
}