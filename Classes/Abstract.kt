abstract class Car{  
    abstract fun run()  
}  
class Honda: Car(){  
   override fun run(){  
println("Honda is running safely..")  
   }  
}  

open class Car1 {  
    open fun run() {  
println("Car is running..")  
    }  
}  
abstract class Honda1 : Car1() {  
    override abstract fun run()  
}  
class City: Honda1(){  
    override fun run() {  
      //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.  
println("Honda City is running..")  
    }  
}

abstract class Bank {  
    abstract fun simpleInterest(p: Int, r: Double, t: Int) :Double  
}  
  
class SBI : Bank() {  
    override fun simpleInterest(p: Int, r: Double, t: Int): Double{  
        return (p*r*t)/100  
    }  
}  
class PNB : Bank() {  
    override fun simpleInterest(p: Int, r: Double, t: Int): Double{  
        return (p*r*t)/100  
    }  
} 

fun main(args: Array<String>){  
val obj = Honda()  
obj.run(); 

val car = Car1()  
car.run()  
val city = City()  
city.run() 

var sbi: Bank = SBI()  
val sbiint = sbi.simpleInterest(1000,5.0,3)  
println("SBI interest is $sbiint")  
var pnb: Bank = PNB()  
val pnbint = pnb.simpleInterest(1000,4.5,3)  
println("PNB interest is $pnbint")
}  