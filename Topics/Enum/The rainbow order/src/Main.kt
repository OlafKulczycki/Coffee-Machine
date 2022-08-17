enum class Rainbow() {
    RED,
    ORANGE,
    YELLOW,
    GREEN,
    BLUE,
    INDIGO,
    VIOLET;
}
fun main() {
    when (readln()) {
        "red" -> println(Rainbow.RED.ordinal + 1)
        "orange" -> println(Rainbow.ORANGE.ordinal + 1)
        "yellow" -> println(Rainbow.YELLOW.ordinal + 1)
        "green" -> println(Rainbow.GREEN.ordinal + 1)
        "blue" -> println(Rainbow.BLUE.ordinal + 1)
        "indigo" -> println(Rainbow.INDIGO.ordinal + 1)
        "violet" -> println(Rainbow.VIOLET.ordinal + 1)
        else -> println("wrong input")
    }
}