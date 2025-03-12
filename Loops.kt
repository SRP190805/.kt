fun main() {
    var i = 0
    while (i < 5) {
      println(i)
      i++
    }

    var j = 5
    do {
        println(j)
        j++
    }
    while (j < 10)

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars) {
        println(x)
    } 

    val nums = arrayOf(1, 5, 10, 15, 20)
    for (x in nums) {
        println(x)
    }

    /* Break Continue */
    var k = 0
    while (k < 10) {
        println(k)
        k++
        if (k == 4) {
            break
        }
    }

    var l = 0
    while (l < 10) {
        if (l == 4) {
            l++
            continue
        }
    println(l)
    l++
    }
}