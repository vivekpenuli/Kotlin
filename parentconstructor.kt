open class A1(val name:String, val age:Int){
    fun display()
    {
        println("my name is ${name}")
        println("my age is ${age}")
    }
}

class B1(name:String, Age:Int,var ph:Int, var clss:String): A1(name, Age)
{
    fun output()
    {
        println("the name of student is ${name}")
        println("the age is ${age}")
        println("the class is ${clss}")
        println("the ph is ${ph}")
    }
}

fun main()
{
    val obj1= B1("vivek",34,4556,"5th")
    obj1.display()
    obj1.output()
}





// ---------------------------Output---------------------------
my name is vivek
my age is 34
the name of student is vivek
the age is 34
the class is 5th
the ph is 4556
