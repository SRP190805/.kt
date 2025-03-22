class Car(var brand: String, var model: String, var year: Int)
class myClass(val name: String, var id: Int) {  // primary constructur without intializer block
}  
class myClass1(name: String, id: Int) {  // primary constructor with intializer block
val e_name: String  
var e_id: Int  
init{  
e_name = name.capitalize()  
e_id = id  
  
println("Name = ${e_name}")  
println("Id = ${e_id}")  
    }  
}
class myClass2{  // Secondary Constructor
  
    constructor(name: String, id: Int){  
println("Name = ${name}")  
println("Id = ${id}")  
    }  
}
class myClass3{  
  
    constructor(name: String, id: Int): this(name,id, "mypassword"){  
println("this executes next")  
println("Name = ${name}")  
println("Id = ${id}")  
    }  
  
    constructor(name: String, id: Int,pass: String){  
println("this executes first")  
println("Name = ${name}")  
println("Id = ${id}")  
println("Password = ${pass}")  
    }  
}
open class Parent{  
  
    constructor(name: String, id: Int){  
println("this executes first")  
println("Name = ${name}")  
println("Id = ${id}")  
    }  
  
    constructor(name: String, id: Int,pass: String){  
println("this executes third")  
println("Name = ${name}")  
println("Id = ${id}")  
println("Password = ${pass}")  
    }  
}  
class Child: Parent{  
    constructor(name: String, id: Int): super(name,id){  
println("this executes second")  
println("Name = ${name}")  
println("Id = ${id}")  
    }  
  
   constructor(name: String, id: Int,pass: String):super(name,id,"password"){  
println("this executes forth")  
println("Name = ${name}")  
println("Id = ${id}")  
println("Password = ${pass}")  
    }  
}

fun main() {
val c1 = Car("Ford", "Mustang", 1969)
val c2 = Car("BMW", "X5", 1999)
val c3 = Car("Tesla", "Model S", 2020)

println(c1.brand)
println(c2.brand)
println(c3.brand)


val myclass = myClass ("Ashu", 101)  
  
println("Name = ${ myclass.name}")  
println("Id = ${ myclass.id}")


val myclass1 = myClass1 ("Ashu", 101) 

val myclass2 = myClass2 ("Ashu", 101)

val myclass3 = myClass3 ("Ashu", 101) 

val obj1 = Child("Ashu", 101)  
val obj2 = Child("Ashu", 101,"mypassword")
}