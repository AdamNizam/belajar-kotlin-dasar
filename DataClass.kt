class User(val name : String, val age : Int){
    override fun toString(): String {
       return "User(name=$name, age=$age)"
   }
}

data class DataUser(val name : String, val age : Int, val benar : Boolean)

fun main(){
//     val user = User("nrohmen", 17)
   val dataUser = DataUser("admnizam wekaweka", 17, true)
   val dataUser1 = DataUser("adm1777", 17, true)
   val copyUser = dataUser.copy()
   val componentUser = copyUser.component1()
   println(componentUser.equals(componentUser))
   
//     val name =  dataUser.component1()
//     val umurUser = dataUser.component2()
//     print(umurUser)
   
//     val dataUser2 = DataUser("adm", 17, true)
//     val dataUser4 = dataUser1.copy(name="bengoh", benar = false)    
//     print(dataUser4)
//     println(user)
//     println(dataUser.equals(dataUser1))
//     println(dataUser.equals(dataUser2))

}
