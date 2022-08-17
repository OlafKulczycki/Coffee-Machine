// Implement your functions here
fun subtractTwoNumbers(a: Long, b: Long){
    println(a-b)
}
fun sumTwoNumbers(a: Long, b: Long){
    println(a+b)
}
fun divideTwoNumbers(a: Long, b: Long){
    if (b.toInt() == 0)
        println("Division by 0!")
    else
        println(a/b)
}
fun multiplyTwoNumbers(a: Long, b: Long){
    println(a*b)
}
/*fun main(){
    //read the Input
    val a = readln().toLong()
    val action = readln()
    val b = readln().toLong()
    //check with method you need
   when (action) {
       "+" -> println(sumTwoNumbers(a,b))
       "-" -> println(subtractTwoNumbers(a,b))
       "*" -> println(multiplyTwoNumbers(a,b))
       "/" -> println(divideTwoNumbers(a,b))
   }
}*/