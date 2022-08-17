fun main() {
    val s1 = readLine().toString()
    val op = readLine().toString()
    val s2 = readLine().toString()
    when(op){
        "equals" -> println(s1 == s2)
        "plus" -> println(s1+s2)
        "endsWith" -> println(s1.endsWith(s2))
        else -> println("Unknown operation")
    }

}