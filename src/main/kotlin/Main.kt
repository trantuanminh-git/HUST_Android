fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    println(1+1)
    println(2.0*3.0)
    println("--------------------------")
    println(2.times(3))
    println(3.5.plus(4))
    println(2.4.div(2))
    println("--------------------------")
    val i: Int = 6
    val b1 = i.toByte()
    println(b1)
    val b2 = i.toString()
    println(b2)
    println("--------------------------")
    val oneMillion = 1_000_000
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    var fish1 = 1
    fish1 = 2 // OK
    val aquarium = 1
//    aquarium = 2 // Error

//    println("--------------------------")
//    val numberOfFish = 5
//    val numberOfPlants = 12
//    println("I have $numberOfFish fish" + " and $numberOfPlants plants")
//    println("I have ${numberOfFish + numberOfPlants} fish and plants")

    println("--------------------------")
    val numberOfFish = 50
    val numberOfPlants = 23
    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }

    println("--------------------------")
    val fish = 50
    if (fish in 1..100) {
        println(fish)
    }

    println("--------------------------")
    if (numberOfFish == 0) {
        println("Empty tank")
    } else if (numberOfFish < 40) {
        println("Got fish!")
    } else {
        println("That's a lot of fish!")
    }

    when (numberOfFish) {
        0  -> println("Empty tank")
        in 1..39 -> println("Got fish!")
        else -> println("That's a lot of fish!")
    }

//    var rocks: Int = null // Error
//    var marbles: Int? = null // OK

    println("--------------------------")
    var fishFoodTreats = 6
    if (fishFoodTreats != null) {
        fishFoodTreats = fishFoodTreats.dec()
    }
    fishFoodTreats = fishFoodTreats?.dec() ?: 0
    println(fishFoodTreats)

//    val len = s!!.length   // throws NullPointerException if s is null

    println("--------------------------")
    val school1 = listOf("mackerel", "trout", "halibut")
    println(school1)

    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")
    println(myList)

    val school = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school))

    println("--------------------------")
    val mix = arrayOf("fish", 2)
    val numbers = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    println(foo2[5])

    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon")
    println(oddList)

    println("--------------------------")
    val array = Array (5) { it * 2 }
    println(java.util.Arrays.toString(array))

    for ((index, element) in school.withIndex()) {
        println("Item at $index is $element\n")
    }
    for (i in 1..5) println(i)

    for (i in 5 downTo 1) println(i)

    for (i in 3..6 step 2) println(i)

    for (i in 'd'..'g') println(i)

    println("--------------------------")
    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")

    repeat(2) {
        println("A fish is swimming")
    }

}

