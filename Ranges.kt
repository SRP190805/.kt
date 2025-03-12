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
}