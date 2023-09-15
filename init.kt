class abc2(var name :String, var age:Int){
    init {
        if(name.equals("vivek"))
            println("you eneter name is correct")
        else
            println("enter correct name wrong")
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
    val d= abc2("kapil",44)
d.outpuname()

}

---------------------------- Note : when object call then init is called ----------------------------------
// you eneter name is correct
// the name is vivek
// the roll no is 23}
// enter correct name wrong
// the name is kapil
// the roll no is 56}


//---------------------------------------------------Case 2------------------------------>
fun main()
{
    val c= abc2("vivek",23)
     val d= abc2("kapil",44)
    c.outputname()
d.outpuname()

}

// you eneter name is correct
// enter correct name
// the name is kapil
// the roll no is 56}
// the name is vivek
// the roll no is 23}
