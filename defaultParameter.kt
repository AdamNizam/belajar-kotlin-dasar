fun main() {
    val cetak = hello(umur = 18, nameFirst = "adm")
    println(cetak)
 
}
   fun hello ( nameFirst : String = "nama anda", nameLast : String = "nama terahir anda" , umur : Int) : String {
        return "$nameFirst $nameLast $umur"
    }