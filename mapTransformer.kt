fun main() {
    val ls= mutableListOf(1,2,3,4,6,8)
    ls.map{
        value ->
        if(value % 2==0)
        {
           value*12
        }
        else{
            value
        }
    }
    
    ls.forEach{
        value ->
        println("the value are ${value}")
    }
    
}
