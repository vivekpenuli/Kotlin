open class a{
    fun show()
    {
        print("hello friends")
    }
}
class b : a()
{
    fun show2()
    {
        print("hello guys")
    }
}
fun main()
{
    var abc= b();
    abc.show();
    abc.show2()
}
