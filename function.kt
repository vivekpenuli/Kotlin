fun main()
{
  hy()
   println(go(5,7))
    println(so(5,7))

}
fun hy()
{
    println("this me ")
}

fun go(a:Int,b:Int): Int
{ //  a=67   cant' reasign value
    return a+b
}

//------------------
fun so(a:Int, b:Int,c:Int =67) = a+b
