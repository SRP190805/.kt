fun main(args: Array<String>) {  
    val number = 5  
    val result: Long  
    result = factorial(number)  
    println("Factorial of $number = $result") 
    
    /* Tail Recursion */
    val number1 = 4  
    val result1: Long  
    result1 = factorial1(number1)  
    println("Factorial of $number1 = $result1") 
}  
  
fun factorial(n: Int): Long {  
    return if(n == 1){  
          n.toLong()  
    }  
    else{  
        n*factorial(n-1)  
    }  
}  

tailrec fun factorial1(n: Int, run: Int = 1): Long {  
    return if (n == 1){  
        run.toLong()  
    } else {  
        factorial1(n-1, run*n)  
    }  
} 