class abc(var name:String, var rool:Int){
    fun display()
    {
        println("The student name is ${name}")
        println("the roll number of student is ${rool}")
    }
}

fun main()
{
    val a = abc("vivek",23)
    val b = abc("sumit",67)
    a.display()
    b.display()
}
