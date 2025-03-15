fun main(args: Array<String>) {  
  
    val mutableMap: MutableMap<String, String> = mutableMapOf<String, String>()  
    mutableMap.put("name", "Ashu")  
    mutableMap.put("city", "Delhi")  
    mutableMap.put("department", "Development")  
    mutableMap.put("hobby", "Playing")  
  
    println("......traverse mutableMap.......")  
  
    for (key in mutableMap.keys) {  
       println("Key = ${key}, Value = ${mutableMap[key]}")  
    }  
  
    println(".....mutableMap.count()........")  
    println(mutableMap.count())  
} 