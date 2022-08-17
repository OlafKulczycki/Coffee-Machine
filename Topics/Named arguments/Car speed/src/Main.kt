fun limitCheck (acSpeed: Int, limit: String = "60"){
    if (limit == "no limit"){
        if (acSpeed > 60)
            println("Exceeds the limit by ${acSpeed-60} kilometers per hour")
        else if (acSpeed <= 60)
            println("Within the limit")
        else
            println("error")
    } else if (acSpeed > limit.toInt())
        println("Exceeds the limit by ${acSpeed-limit.toInt()} kilometers per hour")
      else if (acSpeed <= limit.toInt())
        println("Within the limit")
      else
          println("error")
}
fun main(args: Array<String>) {
    //input
    val acSpeed = readln().toInt()
    var limit = readln().toString()
    //logic
    limitCheck(acSpeed, limit)
}