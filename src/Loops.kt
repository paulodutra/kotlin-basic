fun main(args: Array<String>) {
    //val arr = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    val arr: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)
    for (item in arr) {
        println(item)
    }

    val map = mutableMapOf<Int, Any>()
    //Java Style
    map.put(1, "Key1")
    //Programming
    map[2] = "Key2"
    //Kotlin
    map += 3 to "Key3"

    for (item in map) {
        println(item.key)
        println(item.value)
    }
}