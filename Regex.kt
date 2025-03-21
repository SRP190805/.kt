fun main(args: Array<String>){  
  
val regex = """a([bc]+)d?""".toRegex()  
val matched1 = regex.matches(input = "xabcdy")  
val matched2 = regex.matches(input = "xabcdyabcd")  
val matched3 = regex.matches(input = "abcd")  
println(matched1)  
println(matched2)  
println(matched3)  

val regex1 = Regex("abcd")  
val matchResult1 = regex.matchEntire("abcd")?.value  
val matchResult2 = regex.matchEntire("abcda")?.value  
  
val matchResult3 = Regex("""\d+""").matchEntire("100")?.value    
val matchResult4 = Regex("""\d+""").matchEntire("100 dollars")?.value  
  
println(matchResult1)  
println(matchResult2)  
println(matchResult3)  
println(matchResult4)

val emailParttern = Regex("""\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,6}""")  
val email :String? = emailParttern.find("this is my email mymail@google.com")?.value  
println(email)  
val phoneNumber :String? = Regex(pattern = """\d{3}-\d{3}-\d{4}""").find("phone: 123-456-7890, e..")?.value   
println(phoneNumber)  

val foundResults = Regex("""\d+""").findAll("ab12cd34ef 56gh7 8i")  
val result = StringBuilder()  
for (findText in foundResults) {  
    result.append(findText.value + " ")  
}  
println(result)  

val replaceWith = Regex("beautiful")  
val resultString = replaceWith.replace("this picture is beautiful","awesome")  
println(resultString)

val splitedValue = Regex("""\d+""").split("ab12cd34ef")  
val nonsplited= Regex("""\d+""").split("nothing match to split" )  
println(splitedValue)  
println(nonsplited) 
}  