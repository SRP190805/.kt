fun main (args: Array<String>){  
    try {  
        val data = 5 / 0  
        println(data)  
    } catch (e: NullPointerException) {  
        println(e)  
    } finally {  
        println("finally block always executes")  
    }  
    println("below codes...")

    try {  
        val data = 5 / 0  
        println(data)  
    } catch (e: ArithmeticException) {  
        println(e)  
    } finally {  
        println("finally block always executes")  
    }  
    println("below codes...")    
}
