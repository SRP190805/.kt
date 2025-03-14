fun main(args: Array<String>){  
val obj: Any? = null  
val str: String = obj as String  
println(str) 

val obj1: String? = "String unsafe cast"  
val str1: String? = obj1 as String? // Works  
println(str1)

val location: Any = "Kotlin"  
val safeString: String? = location as? String  
val safeInt: Int? = location as? Int  
println(safeString)  
println(safeInt)
}
