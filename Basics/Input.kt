import java.util.Scanner  
fun main(args: Array<String>) { 
    println("Enter your name")  
    val name = readLine()  
    println("Enter your age")  
    var age: Int = Integer.valueOf(readLine())  
    println("Your name is $name and your age is $age")
    
    val read = Scanner(System.`in`)  
    println("Enter your age")  
    var age1 = read.nextInt()  
    println("Your input age is "+ age1) 
}  
