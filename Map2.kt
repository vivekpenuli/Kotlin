fun main() {
val mp = mutableMapOf<Int,List<Int>>()
mp.put(1,listOf(1,2,3,4))
mp.put(2,listOf(1,2,3,4))
mp.put(3,listOf(1,2,6,4))
mp.put(4,listOf(1,7,3,4))
mp.put(5,listOf(9,2,3,4))
mp.put(6,listOf(2,3,6,4))

mp.forEach{
    key , value ->
    println("the element key is ${key} and value is ${value}")

}
}


/*
Note: val mp = mutableMapOf<Int,listOf<Int>>()
this is not allowed , you have to use  like we do in java
*/
