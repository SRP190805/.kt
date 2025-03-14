fun main(args: Array<String>){  
    var list = listOf(1,2,3,"Ajay","Vijay","Prakash")//read only, fix-size  
    for(element in list){  
        println(element)  
    }  
    println()  
    for(index in 0..list.size-1){  
        println(list[index])  
    }  
    println()
    var stringList: List<String> = listOf<String>("Ajay","Vijay","Prakash","Vijay","Rohan")  
    var list1: List<String> = listOf<String>("Ajay","Vijay","Prakash")  
    for(element in stringList){  
        print(element+" ")  
    }  
    println()  
    println(stringList.get(0))  
    println(stringList.indexOf("Vijay"))  
    println(stringList.lastIndexOf("Vijay"))  
    println(stringList.size)  
    println(stringList.contains("Prakash"))  
    println(stringList.containsAll(list1))  
    println(stringList.subList(2,4))  
    println(stringList.isEmpty())  
    println(stringList.drop(2))  
    println(stringList.dropLast(2))
} 
