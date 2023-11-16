 fun main() {
     val ls1=mutableListOf(1,2,3,4)
     val ls2=mutableListOf(4,6,7,8)
     val ls3=mutableListOf(11,21,31,9)
     val ls4=mutableListOf(112,23,3,4)
     val ls5=mutableListOf(1,2,3,4)

    val ls = setOf(ls1,ls2,ls3,ls4,ls5)
    ls.forEach{
        println(it)
    }
}
