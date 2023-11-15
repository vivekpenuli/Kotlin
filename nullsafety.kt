case 1:

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
var name :String ? = null
    print("the name is ${name.length}")
}

// Output :Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?


case 2:
/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
var name :String ? = null
    print("the name is ${name?.length}")
}
//Output : the name is null
