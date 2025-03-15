fun main(args: Array<String>){  
  
    val hashMap:HashMap<String,String> = HashMap<String,String>(3)  
    hashMap.put("name","Ajay")  
    hashMap.put("city","Delhi")  
    hashMap.put("department","Software Development")  
    println(".....traversing hashmap.......")  
    for(key in hashMap.keys){  
        println("Element at key $key = ${hashMap[key]}")  
    }  
    println(".....hashMap.size.......")  
    println(hashMap.size)  
    hashMap.put("hobby","Travelling")  
    println(".....hashMap.size  after adding hobby.......")  
    println(hashMap.size)  
    println(".....traversing hashmap.......")  
    for(key in hashMap.keys){  
        println("Element at key $key = ${hashMap.get(key)}")  
    }  
}