import java.util.Stack  // from java collection

fun main()
{
    val a= arrayOf(12,34,55)    // Array in kotlin
    println("${a.contains(55)}")
    val b = mutableListOf(1,2,3,4)            // Non updatable array in java
//val c = mutableListOf<*>()
    val mixedList = mutableListOf<Any>()        // Array of any datatype
mixedList.add("hello")
    mixedList.add(34)
    val st1= Stack<Char>() // Stack structure in kotlin
    val e ='a'
    val r='a'
    println("the name is ${e==r}")        // character comparsiosn
    val string1= "hello"
    val string2 ="by"
    val mp = mutableMapOf<String,Int>()
    mp["10"] = 1

 val ls = listOf(1,23,444,56,7,888,5)
    for( i in ls.size-1 downTo 0)
    {
        println("i am is ${i}")
    }

    // if(string1.size)
}
