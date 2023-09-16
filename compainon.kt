class vivek{
    companion object{
        var a=0
        fun hello()
        {
            println("hello i am companio called me ${a}")
        }
    }
    fun hello()
    {
        println("so i am ")
    }
}

fun main() {
    val a=vivek()
    a.hello()
    vivek.hello()
}
