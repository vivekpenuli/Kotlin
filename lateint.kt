fun main()
{

    lateinit var myProperty: String          // Need to define the datatype also
    myProperty="hello"
    var a : String
a="hello woeld"
 //   println("hello b is ${b}")
    println("hello a is ${a}")

}


//------------------------------------//
// Now the question is what is the difference then 

// var a:String 
// a= 23

// here also doing lateinit

// No -- lateintit vs var a: String is not same
/*
lateinint concept used in class where var a: String concept will not work this initalization concept is till function , but 
when it come to class varaible it should be sone via lateinit if you dont do this way you will get compilation error and your programw will not run */

class Abc(var name :String ,
         var age :Int,
         var Id:Int)
{
    lateinit var clas:String
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
