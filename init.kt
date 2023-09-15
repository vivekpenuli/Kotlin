class abc2(var name :String, var age:Int){
    init {
        if(name.equals("vivek"))
            println("you eneter name is correct")
        else
            println("enter correct name")
    }

    fun outputname()
    {
        println("the name is ${name}")
        println("the roll no is ${age}}")
    }
}

fun main()
{
    val c= abc2("vivek",23)
    c.outputname()
    val d= abc2("kapil",56)
    d.outputname()
}
