
interface A3{         //Define Intefrace like this
    fun check()
    {
        println("hello")
    }
    fun go()
}
class B3:A3               // Extend interface 
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
