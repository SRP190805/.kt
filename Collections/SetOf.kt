fun main(args: Array<String>){  
    val mySet: Set<Any> = setOf(2,6,4,29,4,5,"Ajay","Ashu","Ajay")  
    println(".......print Any set.........")  
    for(element in mySet){  
        println(element)  
    }  
    val remainList= mySet.drop(4)  
    println(".......print Set after mySet.drop(4).........")  
    for(element in remainList){  
        println(element)  
    }  
} 