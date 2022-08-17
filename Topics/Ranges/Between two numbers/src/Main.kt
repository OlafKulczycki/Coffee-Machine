fun main() {
    val i1 = readln().toInt()
    val i2 = readln().toInt()
    val i3 = readln().toInt()
    if (i1 in i2..i3)
        println(true)
    else
        println(false)
}