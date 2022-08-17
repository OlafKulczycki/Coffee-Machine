fun main() {
    val i1 = readln().toInt()
    val i2 = readln().toInt()
    val i3 = readln().toInt()
    val i4 = readln().toInt()
    val i5 = readln().toInt()
    if (i5 in i1..i2 && i5 in i3..i4)
        println(true)
    else
        println(false)
}