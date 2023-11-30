// Used to act as a base class to get and set the value into variable
data class student(var name:String,
    var age:Int ,
    var ph:Int,
    var clas:String
    )
// No need to create any get and set function while dealing with data class in kotlin
fun main()
{
    val obj = student("vivek",12,6789,"5th")
    println("the name of student is ${obj.name}")
    println("the age of student is ${obj.age}")
    println("the phone of student is ${obj.ph}")
    println("the class of student is ${obj.clas}")

}
