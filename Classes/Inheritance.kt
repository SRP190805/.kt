open class Employee(name: String,salary: Float) {  
init {  
println("Name is $name.")  
println("Salary is $salary")  
    }  
}  
class Programmer(name: String, dept: String, salary: Float):Employee(name,salary){  
init {  
println("Name $name of department $dept with salary $salary.")  
    }  
    fun doProgram() {  
println("Programming is my passion.")  
  
    }  
}  
class Salesman(name: String, dept: String, salary: Float):Employee(name,salary){  
init {  
println("Name $name of department $dept with salary $salary.")  
    }  
    fun fieldWork() {  
println("Travelling is my hobby.")  
  
    }  
}

// Superclass
open class MyParentClass {
    val x = 5
}
  
// Subclass
class MyChildClass: MyParentClass() {
    fun myFunction() {
        println(x) // x is defined in the superclass
    }
}

open class Patent {  
  
    constructor(name: String, id: Int) {  
println("execute super constructor $name: $id")  
    }  
}  
  
class Child: Patent {  
  
    constructor(name: String, id: Int, dept: String): super(name, id) {  
        print("execute child class constructor with property $name, $id, $dept")  
    }  
}

open class Bird {  
    open var color = "Black"  
    open fun fly() {  
println("Bird is flying...")  
    }  
}  
class Parrot: Bird() {  
    override var color = "Green"  
    override fun fly() {  
println("Parrot is flying...")  
    }  
}  
class Duck: Bird() {  
    override var color = "White"  
    override fun fly() {  
println("Duck is flying...")  
    }  
}

open class Bird1 {  
    open var color = "Black"  
    open fun fly() {  
println("Bird is flying...")  
    }  
}  
class Parrot1: Bird1() {  
    override var color = "Green"  
    override fun fly() {  
        super.fly()  
println("Parrot is flying...")  
  
    }  
}

open class Bird2 {  
    open var color = "Black"  
    open fun fly() {  
println("Bird is flying...")  
    }  
}  
interface Duck2 {  
    fun fly() {  
println("Duck is flying...")  
    }  
}  
class Parrot2: Bird2(),Duck2 {  
    override var color = "Green"  
    override fun fly() {  
        super<Bird2>.fly()  
        super<Duck2>.fly()  
println("Parrot is flying...")  
  
    }  
} 

// Create an object of the MyChildClass and call myFunction
fun main() {
val myObj = MyChildClass()
myObj.myFunction()

val obj1 = Programmer("Ashu", "Development", 40000f)  
obj1.doProgram()  
println()  
val obj2 = Salesman("Ajay", "Marketing", 30000f)  
obj2.fieldWork() 

val child = Child("Ashu",101, "Developer")  

val p = Parrot()  
p.fly()  
println(p.color)  
val d = Duck()  
d.fly()  
println(d.color)

val p1 = Parrot1()  
p1.fly()  
println(p1.color) 

val p2 = Parrot2()  
p2.fly()  
println(p2.color)  
}