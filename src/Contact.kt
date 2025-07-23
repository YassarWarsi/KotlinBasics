class Contact(val id : Int , var email : String)

fun main(){

    val contact = Contact(1,"admin@gmail.com")

    println(contact.email)

    contact.email = "user@gmail.com"

    println(contact.email)

    


}