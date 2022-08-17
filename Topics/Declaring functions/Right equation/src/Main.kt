fun isRightEquation(a: Int, b: Int, c: Int): Boolean {
    if ((a*b)==c) {
        return true
    } else
        return false
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    println(isRightEquation(a, b, c))
}