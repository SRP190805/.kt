fun main(args: Array<String>){  
    var hashSet = HashSet<Int>(3)  
    val intSet = setOf(6,4,29)  
    hashSet.add(2)  
    hashSet.add(13)  
    hashSet.add(6)  
    hashSet.add(5)  
    hashSet.add(2)  
    hashSet.add(8)  
    println("......traversing hashSet......")  
    for (element in hashSet){  
        println(element)  
    }  
    hashSet.addAll(intSet)  
    println("......traversing hashSet after hashSet.addAll(intSet)......")  
    for (element in hashSet){  
        println(element)  
    }  
}