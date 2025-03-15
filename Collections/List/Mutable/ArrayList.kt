fun main(args: Array<String>){  
  
    val arrayList1 = ArrayList<String>(5)  
    arrayList1.add("Ajay")//Adding object in arraylist  
    arrayList1.add("Vijay")  
    arrayList1.add("Prakash")  
    arrayList1.add("Rohan")  
    arrayList1.add("Vijay")  
    println(".......print ArrayList1......")  
    for (i in arrayList1) {  
        println(i)  
    }  
    println("size of arrayList1 = "+arrayList1.size)  
    val arrayList2 = ArrayList<Int>(5)  
    arrayList2.add(14)  
    arrayList2.add(20)  
    arrayList2.add(80)  
    println("......print ArrayList2......")  
    for (i in arrayList2) {  
        println(i)  
    }  
    println("size of arrayList2 = "+arrayList2.size)  
} 