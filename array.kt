
fun main()
{
    val myArr= arrayOf(1,2,3,4)     // These 3 line denote different way of array declaration 
    val a1= IntArray(5)
    val a2= Array<Int>(5){0}
//---------------------------------------------------------
  
   a1.forEach { println(it) }           // These 2 are ways for array traversing
  
   for (i in myArr)
   {
       println("the elements are ${i}")
   }



 //------------------------------ 

 val o =my(arrayOf(1,2,3,4,5))
}

//fun go(number : Array<Int>):Int
//{
//    var sum =0
//    for( i in number)
//    {
//        sum +=i
//    }
//    return sum
//}

fun my(number :Array<Int>):Array<Int>
{
    var sum =0
    for(i in number)
    {
        sum +=i
    }

    return number
}
