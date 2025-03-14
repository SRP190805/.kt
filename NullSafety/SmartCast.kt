fun main(args: Array<String>){  
var string: String? = "Hello!"  
if(string != null) { // smart cast  
    println(string.length) // It works now!  
}  

val obj: Any = "The variable obj is automatically cast to a String in this scope"  
if(obj is String) {  
    // No Explicit Casting needed.  
    println("String length is ${obj.length}")  
} 

val obj1: Any = "The variable obj is automatically cast to a String in this scope"  
if(obj1 !is String) {  
    println("obj is not string")   
} else  
// No Explicit Casting needed.  
println("String length is ${obj1.length}") 
} 
