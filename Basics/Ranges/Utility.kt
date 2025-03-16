fun main(args: Array<String>) {  
var range: IntRange = 1.rangeTo(5)  
println("Printing value: 1.rangeTo(5)")  
    for (x in range){  
        print("$x ")  
    }  
println("")  
var range2: IntRange = IntRange(1,5)  
println("Printing value: IntRange(1,5)")  
    for (x in range2){  
        print("$x ")  
    }  

println("Range 1")  
var range1 = 5 downTo 1  
    for (x in range1){  
        print("$x ")  
    }  
println()  
println("Range 6")  
var range6: IntProgression = 5.downTo(1)  
    for (x in range6){  
        print("$x ")  
    }  
println()  
println("Range 3")  
var range3: IntProgression = IntProgression.fromClosedRange(5,1,-1)  
    for (x in range3){  
        print("$x ")  
    }  
  
println("Reversed 1")  
var range7 = 1..5  
    for (x in range7.reversed()){  
        print("$x ")  
    }  
println()  
println("Reversed 2")  
var range8: IntRange = IntRange(1,5)  
    for (x in range8.reversed()){  
        print("$x ")  
    }  
println()  
println("Reversed 3")  
var range9 = IntProgression.fromClosedRange(5,1,-1)  
    for (x in range9.reversed()){  
        print("$x ")  
    }  
println()  
println("Reversed 4")  
var range4: IntProgression = IntProgression.fromClosedRange(5,1,-2)  
    for (x in range4.reversed()){  
        print("$x ")  
    }

val range5: IntRange = 1..10  
println("Print range value with step 2:")  
    for(x in range5 step (2)){  
        print("$x ")  
    }  
println("")  
println("Print range value with step 3:")  
    for(x in range5 step 3){  
        print("$x ")  
    }  
val first=((range5 step 2).first)  
val last=((range5 step 2).last)  
println("")  
println("First value of interval: $first")  
println("Last value of interval: $last ")  
} 