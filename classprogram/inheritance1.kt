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


/*
in kotlin by default class are final and htey cant be inherited without using open keyword.
to inherit we need to make parent class opne in order to allow inheritance
*/
