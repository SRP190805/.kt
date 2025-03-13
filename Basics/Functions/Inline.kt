fun main(args: Array<String>) {  
inlineFunctionExample({  println("calling inline functions")},  
            {  println("next parameter in inline functions")} )  
  
println("this is main function closing")  
}  
  
inline fun inlineFunctionExample(myFun: () -> Unit, noinline nxtFun: () -> Unit  ) {  
myFun()  
nxtFun()  
println("code inside inline function")  
}
