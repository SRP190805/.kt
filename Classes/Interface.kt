interface MyInterface  {  
var id: Int            // abstract property  
    fun absMethod():String    // abstract method  
    fun doSomthing() {  
println("MyInterface doing some work")  
    }  
}  
class InterfaceImp : MyInterface {  
    override var id: Int = 101  
    override fun absMethod(): String{  
return "Implementing abstract method.."  
    }  
}

interface MyInterface1 {  
    fun doSomthing1()  
}  
interface MyInterface2 {  
    fun absMethod1()  
}  
class MyClass : MyInterface1, MyInterface2 {  
    override fun doSomthing1() {  
println("overriding doSomthing() of MyInterface1")  
    }  
  
    override fun absMethod1() {  
println("overriding absMethod() of MyInterface2")  
    }  
} 

interface MyInterface3 {  
    fun doSomthing2() {  
println("MyInterface 1 doing some work")  
    }  
        fun absMethod2()  
}  
interface MyInterface4 {  
    fun doSomthing2(){  
println("MyInterface 2 doing some work")  
    }  
    fun absMethod2(name: String)  
}  
class MyClass1 : MyInterface3, MyInterface4 {  
    override fun doSomthing2() {  
        super<MyInterface4>.doSomthing2()  
    }  
  
    override fun absMethod2() {  
println("Implements absMethod() of MyInterface1")  
    }  
    override fun absMethod2(n: String) {  
println("Implements absMethod(name) of MyInterface2 name is  $n")  
    }  
}

interface MyInterface5 {  
    fun doSomthing3() {  
println("MyInterface 1 doing some work")  
    }  
    fun absMethod3()  
}  
  
interface MyInterface6 {  
    fun doSomthing3() {  
println("MyInterface 2 doing some work")  
    }  
   fun absMethod3() {  
println("MyInterface 2 absMethod")  
    }  
  
}  
  
class C : MyInterface5 {  
    override fun absMethod3() {  
println("MyInterface1 absMethod implementation")  
    }  
}  
  
class D : MyInterface5, MyInterface6 {  
    override fun doSomthing3() {  
        super<MyInterface5>.doSomthing3()  
        super<MyInterface6>.doSomthing3()  
    }  
  
    override fun absMethod3() {  
  
        super<MyInterface6>.absMethod3()  
    }  
}  

fun main(args: Array<String>) {  
val obj = InterfaceImp()  
println("Calling overriding id value = ${obj.id}")  
obj.doSomthing()  
println(obj.absMethod())  

val myClass = MyClass()  
myClass.doSomthing1()  
myClass.absMethod1()  

val myClass1 = MyClass1()  
myClass1.doSomthing2()  
myClass1.absMethod2()  
myClass1.absMethod2("Ashu") 

val d = D()  
val c = C()  
d.doSomthing3()  
d.absMethod3()  
c.doSomthing3()  
c.absMethod3() 
}  