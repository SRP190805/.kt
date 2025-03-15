fun main(args: Array<String>) {  
    val mutableSet1 = mutableSetOf<Int>(2, 6, 4, 29, 4, 5)  
  
    println("....mutableSet1....")  
    for(element in mutableSet1){  
        println(element)  
    }  
    println("....mutableSet1.first()....")  
    println(mutableSet1.first())  
  
    println("...mutableSet1.indexOf(4)...")  
    println(mutableSet1.indexOf(4))  
  
    println("...mutableSet1.drop(3)...")  
    println(mutableSet1.drop(3))  

    if(mutableSet1.any())  
        println("mutableSet1 contain at least one or more elements")  
    else  
        println("mutableSet1 not contain any element") 
} 