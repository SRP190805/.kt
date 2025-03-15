fun main() {
    for (chars in 'a'..'x') {
      println(chars)
    }
    
    for (nums in 5..15) {
        println(nums)
    }
    
    val nums = arrayOf(2, 4, 6, 8)
    if (2 in nums) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    for (nums in 5..15) {
      if (nums == 10) {
        break
      }
      println(nums)
    }

    for (nums in 5..15) {
      if (nums == 10) {
        continue
      }
      println(nums)
    }

    for (a in 5 downTo 1){  
      print(a )// 54321  
    } 

    for (a in 1 until 5){  
      print(a ) // print 1234  
    } 

    for (x in 1..5)  
      print(x)  
    println()  
    for (x in 5 downTo 1)  
      print(x)  
    println()  
    for (x in 1.rangeTo(5))  
      print(x)  
    println()  
    for (x in 5.downTo(1))  
      print(x)  
    println() 

    for(y in 'a'..'e')  
      print("$y ")  
    println()  
    for (y in 'e' downTo 'a')  
      print("$y ") 

    for (y in 1..10 step 2)  
      print("$y ")  
    println()  
    for (y in 10 downTo 1 step 3)  
      print("$y ")

    val chars = ('a'..'e')  
    val it = chars.iterator()  
    while (it.hasNext()) {  
      val x = it.next()  
      print("$x ")  
    } 
}