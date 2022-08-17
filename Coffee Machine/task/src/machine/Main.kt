package machine
//variables
var waterCap = 400
var milkCap = 540
var beansCap = 120
var cupsOrder = 9
var money = 550
var exit = true
//  String variables
const val enothResaurces = "I have enough resources, making you a coffee!\n"
const val notEnothRes = "Sorry, i haven't enough resources, making you a coffee!\n"
const val notWater = "Sorry, not enough water!\n"
const val notCoffee = "Sorry, not enough coffee beans!\n"
const val notCups = "Sorry, not enough cups!\n"
const val notMilk = "Sorry, not enough milk!\n"
//functions
fun readOrder () {
    println("Write how many ml of water the coffee machine has:")
    waterCap = readln().toInt()
    println("Write how many ml of milk the coffee machine has:")
    milkCap = readln().toInt()
    println("Write how many grams of coffee beans the coffee machine has:")
    beansCap = readln().toInt()
    println("Write how many cups of coffee you will need:")
    cupsOrder = readln().toInt()
}
fun calculateOrder() {
    var cupCounter = 0
    var possible = true
    while (possible){
        if (waterCap >= 200 && milkCap >= 50 && beansCap >= 15) {
            waterCap -= 200
            milkCap -= 50
            beansCap -= 15
            cupCounter++
        } else
            possible = false
    }
    if (cupCounter == cupsOrder) {
        println("Yes, I can make that amount of coffee")
    } else if (cupsOrder < cupCounter) {
        cupsOrder = cupCounter - cupsOrder
        println("Yes, I can make that amount of coffee (and even $cupsOrder more than that)")
    } else
        println("No, I can make only $cupCounter cups of coffee")
}
//States
fun buy () {
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino," +
            " back - to main menu:")
    val choice = readln().toString()
    if (choice == "1") {
        if (waterCap >= 250 && beansCap >= 16 && cupsOrder > 0){
            println(enothResaurces)
            waterCap -= 250
            beansCap -= 16
            cupsOrder--
            money += 4
        } else if (waterCap < 250 && beansCap >= 16 && cupsOrder > 0){
            println(notWater)
        } else if (waterCap >= 250 && beansCap < 16 && cupsOrder > 0){
            println(notCoffee)
        } else if (waterCap >= 250 && beansCap >= 16 && cupsOrder <= 0){
            println(notCups)
        } else
            println(notEnothRes)
    } else if (choice == "2"){
        if (waterCap >= 350 && milkCap >= 75 && beansCap >= 20 && cupsOrder > 0){
            println(enothResaurces)
            waterCap -= 350
            milkCap -= 75
            beansCap -= 20
            cupsOrder--
            money += 7
        } else if (waterCap < 350 && milkCap >= 75 && beansCap >= 20 && cupsOrder > 0){
            println(notWater)
        } else if (waterCap >= 350 && milkCap >= 75 && beansCap < 20 && cupsOrder > 0){
            println(notCoffee)
        } else if (waterCap >= 350 && milkCap >= 75 && beansCap >= 20 && cupsOrder < 0){
            println(notCups)
        } else if (waterCap >= 350 && milkCap < 75 && beansCap >= 20 && cupsOrder > 0){
            println(notMilk)
        } else
            println(enothResaurces)
    } else if (choice == "3") {
        if (waterCap >= 200 && milkCap >= 100 && beansCap >= 12 && cupsOrder > 0) {
            println(enothResaurces)
            waterCap -= 200
            milkCap -= 100
            beansCap -= 12
            cupsOrder--
            money += 6
        } else if (waterCap < 200 && milkCap >= 100 && beansCap >= 12 && cupsOrder > 0){
            println(notWater)
        } else if (waterCap >= 200 && milkCap >= 100 && beansCap < 12 && cupsOrder > 0){
            println(notCoffee)
        } else if (waterCap >= 200 && milkCap >= 100 && beansCap >= 12 && cupsOrder < 0){
            println(notCups)
        } else if (waterCap >= 200 && milkCap < 100 && beansCap >= 12 && cupsOrder > 0){
            println(notMilk)
        } else
            println(notEnothRes)
    } else if (choice == "back")
        return
      else
        println(false)
}
fun fill () {
    println("Write how many ml of water do you want to add:")
    val waterAdd = readln().toInt()
    waterCap += waterAdd
    println("Write how many ml of milk do you want to add:")
    val milkAdd = readln().toInt()
    milkCap += milkAdd
    println("Write how many grams of coffee beans do you want to add:")
    val beansAdd = readln().toInt()
    beansCap += beansAdd
    println("Write how many disposable cups of coffee do you want to add:")
    val cupsAdd = readln().toInt()
    cupsOrder += cupsAdd
}
fun take () {
    println("I gave you $$money\n")
    money = 0
}
fun remaining () {
    println("The coffee machine has:\n$waterCap ml of water\n$milkCap ml of milk\n" +
            "$beansCap g of coffee beans\n$cupsOrder disposable cups\n$$money" +
            " of money\n")
}
// main
fun main() {
    while (exit) {
        println("Write action (buy, fill, take, remaining, exit):")
        when(readln().toString()) {
            "buy" -> buy()
            "fill" -> fill()
            "take" -> take()
            "remaining" -> remaining()
            "exit" -> exit = false
            else -> println(false)
        }
    }
}
