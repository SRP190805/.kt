class outerClass{  
    private  var name: String = "Ashu"  
    inner class  innerClass{  
        var description: String = "code inside inner class"  
        private var id: Int = 101  
        fun foo(){  
            println("name is ${name}") // access the outer class member even private  
            println("Id is ${id}")  
        }  
    }  
}  

fun main(args: Array<String>){  
println(outerClass().innerClass().description) // accessing property  
var obj = outerClass().innerClass() // object creation  
obj.foo() // access member function  
} 