fun main(args: Array<String>){  
    try {  
        val data = 20 / 0  //may throw exception  
    } catch (e: ArithmeticException) {  
        println(e)  
    }  
    println("code below exception...")  

    val str = getNumber("10.5")  
    println(str)  
}

fun getNumber(str: String): Int{  
    return try {  
        Integer.parseInt(str)  
    } catch (e: NumberFormatException) {  
        0  
    }
}
