import kotlin.random.Random


fun main(){
        val d: Int;
        val check = false

        if (check){
            d=1;
        }else{
            d=0

        }
    println(d)

        val a = 4
        val b = 7


    println(if (b>a) a else b)

        val obj = "Snoop"

        //when used as a STATEMENT
        when (obj){
            "Dogg" -> println("the rapper")
            "Snoop" -> println("death row records")
            "Snoop" -> println("dr. dre")
            else -> println("UNKNOWN")
        }

        //when used as an EXPRESSION
        val result = when (obj){
            "Dogg" -> "the rapper"
            "Snoop" -> "dr. dre"
            "Snoop" -> "death row records"
            else -> "UNKNOWN"

        }

        println(result)


        //when w/o a SUBJECT

        val trafficLightState = "Red"

        val trafficAction = when{
            trafficLightState == "Green" -> "Go"
            trafficLightState == "Yellow" -> "Wait"
            trafficLightState == "Red" -> "Stop"
            else -> "Malfunction"
        }
        println(trafficAction)

        println("e x e r c i s e - 1")

        val dice1 = Random.nextInt( 1 ,7)
        val dice2 = Random.nextInt(1,7)

        println("$dice1 & $dice2")
        println( if (dice2 == dice1) "You Win :)" else "You Lose :(" )


    println("e x e r c i s e - 2")

        val button = "A"
        val action = when(button){
            "X" -> "Menu"
            "Y" -> "Nothing"
            "A" -> "Yes"
            "B" -> "No"
            else -> "NO such button"

        }
        println(action)

    println("L O O P S")
    println("FOR")

    for (number in 1..5){
        print("$number ")
    }

    println("LOOPS EXERCISE 1a")
    var pizzaSlices = 0
    // Start refactoring here
    while(pizzaSlices<7) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
               // End refactoring here
    }
    pizzaSlices++
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")


    println("LOOPS EXERCISE 1b")
    var pizzaSlices2 = 0
    // Start refactoring here
    pizzaSlices2++
    do{
        println("There's only $pizzaSlices2 slice/s of pizza :(")
        pizzaSlices2++
    }while(pizzaSlices2<8)
        // End refactoring here
        println("There are $pizzaSlices2 slices of pizza. Hooray! We have a whole pizza! :D")


    println("LOOPS EXERCISE 2")

    for (number in 1..100){
       println( when{
            (number%15 ==0) -> "fizzbuzz"
            (number%3 == 0) -> "fizz"
            (number%5 == 0) -> "buzz"

            else -> number
       }
       )
    }

    println("LOOPS EXERCISE 3")

    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for(word in words){
        if (word.startsWith('l'))
            println(word)

        

    }

}


