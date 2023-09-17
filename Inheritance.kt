open class a{
    fun run()
    {
        println("this is class a ")
    }
}
class B: a(){
    fun op()
    {
        println("i am class b")
    }
}

fun main()
{
    val o =B()
    o.run()

}
