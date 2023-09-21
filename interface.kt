//interface A3{
    fun check()
    {
        println("hello")
    }
    fun go()
}
class B3:A3
{
    override fun go() {
println("hello")
    }

}

fun main()
{
    val obj = B3()
    obj.go()
    obj.check()
}
