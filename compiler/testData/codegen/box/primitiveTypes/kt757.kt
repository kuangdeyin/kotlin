// TODO: muted automatically, investigate should it be ran for JS or not
// IGNORE_BACKEND: JS

package demo_long

fun Long?.inv() : Long = this!!.inv()

fun box() : String {
    val x : Long? = 10
    System.out?.println(x.inv())
    return if(x.inv() == -11.toLong()) "OK" else "fail"
}
