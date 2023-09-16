class vivek{
    companion object{
        var a=0
        fun hello()
        {
            println("hello i am companio called me ${a}")
        }
    }
    fun hello()       // can have same function name outside comanion block
    {
        println("so i am ")
    }
}

fun main() {
    val a=vivek()    
    a.hello()        // able to acess only outside function .
                      // class objects are not allowed to acess memeber function and data memeber of class
                       
    vivek.hello()
}
