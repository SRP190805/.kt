fun myFunction() {
    println("I just got executed!")
}
// Outputs "I just got executed!" 

fun myFunction(fname: String) {
    println(fname + " Doe")
}
// John Doe
// Jane Doe
// George Doe

fun myFunction(x: Int): Int {
    return (x + 5)
}
// 8 (3 + 5)

fun main() {
    myFunction()
    myFunction("John")
    myFunction("Jane")
    myFunction("George")
    var result = myFunction(3)
    println(result)
}
