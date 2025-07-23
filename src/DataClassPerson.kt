data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true)

data class Name(val firstName: String, val secondName: String)
data class Address(val streetName: String, val city : City)
data class City(val cityName: String, val country: String)


fun main() {
    val person = Person(
        Name("John", "Smith"),
        Address("123 Fake Street", City("Springfield", "US")),
        ownsAPet = false
    )

    println(person)

}
