open class A{
   open fun run()
    {
        println("i am class a ")
    }
}
class Bclass:A(){
    override fun run()
    {
        println("i am in class B")
    }
}

fun main()
{
    val obj = A()
    val obj2 = Bclass()
    obj.run()
    obj2.run()
}

//--------------------------Output---------------------//
i am class a 
i am in class B
