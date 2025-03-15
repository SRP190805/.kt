fun main(args: Array<String>){  
    val list: ArrayList<String> = arrayListOf<String>()  
  
    list.add("Ajay")  
    list.add("Vijay")  
    list.add("Prakash")  
  
    println(".......print ArrayList.......")  
    val itr = list.iterator()  
    while(itr.hasNext()) {  
        println(itr.next())  
    }  
}