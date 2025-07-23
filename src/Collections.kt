fun main(){

    println("Collections - L I S T")

    val readOnlyShapes = listOf("circle","square","triangle")
    println(readOnlyShapes)

    val shapes: MutableList<String> = mutableListOf("circle","triangle","square")
    println(shapes)

    val shapesLocked: List<String> = shapes //casting

    println(shapesLocked)

    println("The first item of the list readOnlyShapes is ${readOnlyShapes[0]}")
    println("The first last of the list readOnlyShapes is ${readOnlyShapes.last()}")

    println("rectangle" in shapes)

    shapes.add("Trapezium")

    println(shapes)

    val narutoFixedCharacters = setOf("Pain","Jiraya","Sakura")
    println(narutoFixedCharacters)

    val narutoCharacters: MutableSet<String> = mutableSetOf("Pain","Sasuke","Shikamaru")
    println(narutoCharacters)

    val narutoFixed: Set<String> = narutoCharacters;

    println("no of characters in narutoCharacters list is ${narutoCharacters.count()}")

    narutoCharacters.add("Akamaru")
    println(narutoCharacters)

    println("no of characters in narutoCharacters list is ${narutoCharacters.count()}")

    println("M A P")

    val readOnlyJuiceMenu = mapOf("apple" to 10, "mousambi" to 20, "orange" to 30)
    println(readOnlyJuiceMenu)

    val juiceMenu: MutableMap<String,Int> = mutableMapOf("apple" to 10, "mousambi" to 20, "orange" to 30, "mixed" to 40 )
    println(juiceMenu)

    val fixedJuice: Map<String, Int> = juiceMenu
    println(fixedJuice)

    println("The value of orange juice is ${juiceMenu["orange"]}")

    juiceMenu["pineapple"] = 50

    println(juiceMenu)

    juiceMenu.remove("pineapple")

    println("Removed pineapple from Juice Menu. Now it has ${juiceMenu.count()} key value pairs")

    println(juiceMenu.containsKey("mixed"))

    println("orange" in juiceMenu)

    println("pineapple" in juiceMenu)

    println(20 in juiceMenu.values)

    println("Exercise 1")

    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    val totalNumbers = greenNumbers.count() + redNumbers.count()
    println("total numbers are $totalNumbers")

    println("Exercise 2")

    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = SUPPORTED.contains(requested.uppercase())
    println("Support for $requested: $isSupported")

    println("Exercise 3")

    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as ${number2word[n]}")
}