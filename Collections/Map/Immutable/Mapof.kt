fun main(args: Array<String>){  
  
    val myMap: Map<Int,String> = mapOf<Int, String>(1 to "Ajay", 4 to "Vijay", 3 to "Prakash")  
  
    for(key in myMap.keys){  
        println("Element at key $key = ${myMap.get(key)}")  
    }  
    println("......myMap.plus(Pair(5, \"Rohan\"))......")  
    for(p in myMap.plus(Pair(5, "Rohan"))){  
        println("Element at key ${p.key} = ${p.value}")  
    }  
      
    val myMap1: Map<Int,String> = mapOf<Int, String>(1 to "Ajay", 4 to "Vijay", 3 to "Prakash")  
  
    for(key in myMap1.keys){  
        println("Element at key $key = ${myMap1.get(key)}")  
    }  
      println("......myMap1.iterator()......")  
    for(itr1 in myMap1.iterator()){  
        println("key = ${itr1.key} value = ${itr1.value}")  
    }  
}
