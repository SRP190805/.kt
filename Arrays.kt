fun main() {
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[0])

    println(cars.size)
    // Outputs 4 

    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    } // Checks if volov exists in the array.

    for (x in cars) {
        println(x)
    }
    // Outputs the whole array

    val array1 = arrayOf(1,2,3,4)  
    val array2 = arrayOf<Long>(11,12,13,14)  
    array1.set(0,5)  
    array1[2] = 6  
  
    array2.set(2,10)  
    array2[3] = 8  
  
    for(element in array1){  
        println(element)  
    }  
    println()  
    for(element in array2){  
        println(element)  
    }
    println(array1.get(0))  
    println(array1[2])  
    println()  
    println(array2.get(2))  
    println(array2[3])

    var myArray = Array<Int>(5){0}  
    myArray[1]= 10  
    myArray[3]= 15  
  
    for(element in myArray){  
        println(element)  
    } 

    var myArray5: IntArray = intArrayOf(5,10,20,12,15)  
    for (index in 0..4){  
        println(myArray5[index])  
    }  
    println()  
    for (index in 0..myArray5.size-1){  
        println(myArray5[index])  
    } 
  }