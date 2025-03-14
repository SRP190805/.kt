fun main(args: Array<String>) {  
    validate(15)  
    println("code after validation check...")  
}  
fun validate(age: Int) {  
    if (age < 18)  
        throw ArithmeticException("under age")  
    else  
        println("eligible for drive")  
} 