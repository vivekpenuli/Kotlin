fun main() {
    val ls= mutableListOf(1,2,3,4,6,8)
    ls.map{
        value ->
        if(value % 2==0)
        {
           value*12
        }
        else{
            value       // this denote that for else part i want just that item to reamin presetn unchanged . if i dont do this it will not show that item
        }
    }
    
    ls.forEach{
        value ->
        println("the value are ${value}")
    }
    
}


/*
Remember :  you cant do valuw =value * 12 . you cant use assignment operator with iteratorr varaible
*/
