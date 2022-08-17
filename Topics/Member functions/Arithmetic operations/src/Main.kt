import java.util.InputMismatchException

class ArithmeticOperations(x: Int, y: Int) {
    var x = x
    var y = y

    fun addition(): Int {
        return x + y
    }
    fun subtraction(): Int {
        return x - y
    }
    fun multiplication(): Int {
        return x * y
    }
    fun division(): Int {
        return x / y
    }
}
