fun main() {
    println(null.semangat)
}
 val Int?.semangat: Int
    get() = if (this == null) 0 else this.div(2)

 
// val Int.semangat
//     get() = this / 2
//     
// val Int?.semangat: Int
//     get() = this?.div(2) ?: 0