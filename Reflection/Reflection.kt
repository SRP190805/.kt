class A(val x: Int)
fun main(args: Array<String>) {  
fun isPositive(x: Int) = x > 0  
val numbers = listOf(-10, -5, 0, 5, 10)  
println(numbers.filter(::isPositive))  

fun isPositive(s: String) = s== "kotlin" || s == "Kotlin"  
val numbers1 = listOf(-10,-5,0,5,10)  
val strings = listOf("kotlin", "program")   
println(numbers1.filter(::isPositive))  
println(strings.filter(::isPositive)) 

println(::x.get())  
println(::x.name)  
println(::y.set(10))

val prop = A::x  
println(prop.get(A(5))) 
}
val x = 5  
var y = 5  
