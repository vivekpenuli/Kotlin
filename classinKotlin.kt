class Abc(var name :String ,
         var age :Int,
         var Id:Int)
{
  fun show()
  {
  println("the name of the student is ${name}")
  println("the age of the student  is ${age}")
  println("the ID of the student is ${name}")  
  }
}
fun main()
{
  var a1=Abc("vivek",45,101)
  // var a2=Abc("sumit",35,102)
  // var a3=Abc("gopal",85,103)
  // var a4=Abc("anirudh",25,104)

  a1.show()
  
  
}
