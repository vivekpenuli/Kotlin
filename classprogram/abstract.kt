abstract class a1{      // No need to ue Open Keyword here
    fun run()
    {

    }
   abstract fun hello()
}
class b2: a1(){
    override fun hello() {
        TODO("Not yet implemented")
    }
}

fun main()
{
 //   val obje1= a1()   // Not object possible of abstract class
    val obj2=b2()
    obj2.hello()
 obj2.run()
}
