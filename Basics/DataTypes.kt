fun main() {
    val myNum: Int = 5                // Int, can store whole numbers from -2147483648 to 2147483647
    val myDoubleNum: Double = 5.99    // Double
    val myLetter: Char = 'D'          // Char
    val myBoolean: Boolean = true     // Boolean
    val myText: String = "Hello"      // String
    val myNum1: Short = 5000          // can store whole numbers from -32768 to 32767
    println(myNum1)
    val myNum2: Byte = 100           // can store whole numbers from -128 to 127
    println(myNum2)
    val myNum3: Long = 100000000L     // can store whole numbers from -9223372036854775808 to 9223372036854775807
    println(myNum3)
    val myNum4: Float = 35E3F         // e or E represents the power to 10
    val myNum5: Double = 12E4
    println(myNum4)
    println(myNum5)
    println(myNum)
    println(myDoubleNum)
    println(myLetter)
    println(myBoolean)
    println(myText)

    val x: Int = 5
    val y: Long = x.toLong()
    println(y)
  }
