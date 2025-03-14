fun main() {
    var greeting: String = "Hello"
    println(greeting)

    println(greeting[0]) // first element (H)
    println(greeting[2]) // third element (l)
    
    println("The length of the txt string is: " + greeting.length)

    println(greeting.uppercase())   // Outputs "HELLO"
    println(greeting.lowercase())   // Outputs "hello"

    var txt2 = "Hello World"
    println(greeting.compareTo(txt2))  // Outputs 0 (they are equal)

    println(greeting.indexOf("o"))

    var Name = "John "
    var SurName = "Doe"
    println(Name.plus(SurName)) 

    var firstName = "sujal"
    var lastName = "patel"
    println("My name is $firstName $lastName")

    val a = 10  
    val b = 5
    val myString = """value $a  
        |is greater than value $b  
    """.trimMargin()  
    println("${myString}") 

    val text = """Kotlin is official language  
        #announce by Google for  
        #android application development  
    """.trimMargin("#")  
    println(text) 

    val str1 = buildString { "string value" }  
    val str2 = buildString { "string value" }  
    println(str1===str2)  
    println(str1!==str2)
}
