fun main(args: Array<String>) {  
    run()
    run(3)  
    run(3,'a')  
}  
fun run(num:Int= 5, latter: Char ='x'){  
    println("parameter in function definition $num and $latter")  
}