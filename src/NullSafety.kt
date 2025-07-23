fun main(){

    var notNullable : String = "This cant be null"


    var nullable : String? = "This can be null"

    nullable = null

    fun strLen(notNull : String) : Int{
        return notNull.length
    }

    println(strLen(notNullable))

   // println(strLen(nullable))   //will give compiler error

    println("_________________________________________")

    fun checkString( maybeString : String?) : String {
        if (maybeString != null && maybeString.length > 0)
            return "This string is not null, its length is ${maybeString.length}"
        else
            return "This string is null"
    }

    val nullString : String? = null

    println(checkString(nullString))
    println(checkString(""))

    println("_________________________________________")

    fun lenString(str : String?) : Int? = str?.length

    println(lenString(""))
    println(lenString("yomama"))

    println(nullString?.uppercase())

    println(nullString?.length)

    println(nullString?.length ?: "Zero - 0")

    var checkingString : String? = "Keeping this string not null"

    println("String content: ${checkingString} | ${checkingString?.length ?: "zero"}")

    checkingString = nullString

    println("String content: ${checkingString} | ${checkingString?.length ?: "zero"}")


}