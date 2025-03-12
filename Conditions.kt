fun main() {
    val x = 20
    val y = 18
    if (x > y) {
      println("x is greater than y")
    }

    val time = 20
    if (time < 18) {
        println("Good day.")
    } else {
        println("Good evening.")
    }
    // Outputs "Good evening."

    val time1 = 17
    val greeting = if (time1 < 18) {
        "Good day."
    } else {
        "Good evening."
    }
    println(greeting) // Outputs "Good Day."

    val time2 = 20
    val greeting1 = if (time2 < 16) "Good Afternoon" else "Good Night."
    println(greeting1) // Outputs "Good Night."
}