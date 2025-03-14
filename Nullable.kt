fun main(args: Array<String>){  
var str: String? = "Hello" // variable is declared as nullable  
str = null  
print(str)  

var str1: String? = "Hello"     // variable is declared as nullable  
var len = if(str1!=null) str1.length else -1  
println("str is : $str1")  
println("str length is : $len")  
  
str1 = null  
println("str is : $str1")  
len = if(str1!=null) str1.length else -1  
println("b length is : $len")
}