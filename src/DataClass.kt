data class User( val name : String, val id : Int)

fun main(){

    val user = User("Alyx", 1)

    val secondUser = User("Alyx", 1)
    val thirdUser = User("Gordon", 3)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user.equals(thirdUser)}")

    println("C O P Y   I N S T A N C E")

    println(user.copy())

    println(user.copy("MadMax"))

    println(user.copy(id = 4))
}