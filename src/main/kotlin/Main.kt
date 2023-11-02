//fun main(args: Array<String>) {
//    println("Hello ${args[0]}")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
//
//    println("---------------------------------")
//
//    val isUnit = println("This is an expression")
//    println(isUnit)
//
//    val temperature = 10
//    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
//    println(message)
//
//}

// ----------------------------------------------------
//import java.util.*    // required import
////fun fishFood (day : String) : String {
////    var food = ""
////    when (day) {
////        "Monday" -> food = "flakes"
////        "Tuesday" -> food = "pellets"
////        "Wednesday" -> food = "redworms"
////        "Thursday" -> food = "granules"
////        "Friday" -> food = "mosquitoes"
////        "Saturday" -> food = "lettuce"
////        "Sunday" -> food = "plankton"
////    }
////    return food
////}
//fun fishFood (day : String) : String {
//    return when (day) {
//        "Monday" -> "flakes"
//        "Wednesday" -> "redworms"
//        "Thursday" -> "granules"
//        "Friday" -> "mosquitoes"
//        "Sunday" -> "plankton"
//        else -> "nothing"
//    }
//}
//
//fun feedTheFish() {
//    val day = randomDay()
//    val food = fishFood(day)
//
//    println ("Today is $day and the fish eat $food")
//}
//fun main(args: Array<String>) {
//    feedTheFish()
//    println(shouldChangeWater(randomDay()))
//}
//
//fun randomDay() : String {
//    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
//        "Friday", "Saturday", "Sunday")
//    return week[Random().nextInt(week.size)]
//}
//
//fun shouldChangeWater (day: String, temperature: Int = 22 , dirty: Int = 20): Boolean {
//    return when {
//        isTooHot(temperature) -> true
//        isDirty(dirty) -> true
//        isSunday(day) ->  true
//        else -> false
//    }
//}
//
//fun isTooHot(temperature: Int) = temperature > 30
//
//fun isDirty(dirty: Int) = dirty > 30
//
//fun isSunday(day: String) = day == "Sunday"

// -------------------------------------------------------------

//fun main(args: Array<String>) {
//    swim()   // uses default speed
//    swim("slow")   // positional argument
//    swim(speed="turtle-like")   // named parameter
//}
//
//fun swim(speed: String = "fast") {
//    println("swimming $speed")
//}

// -------------------------------------------------------------

val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")


fun main(args: Array<String>) {
    // eager, creates a new list
    val eager = decorations.filter { it [0] == 'p' }
    println("eager: $eager")

    val filterd = decorations.asSequence().filter { it[0] == 'p' }
    println("filterd: ${filterd}")

    val newList = filterd.toList()
    println("newList: ${newList}")

    println("=======================================================")
    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }

    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")

    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
        println("access: $it")
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}")

    val mysports = listOf("basketball", "fishing", "running")
    val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
    val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
    val mylist = listOf(mysports, myplayers, mycities)     // list of lists
    println("-----")
    println("Flat: ${mylist.flatten()}")

    println("=============================")
    fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
        return operation(dirty)
    }
    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
    println(updateDirty(30, waterFilter))

    fun increaseDirty( start: Int ) = start + 1
    println("-----")
    println(updateDirty(15, ::increaseDirty))

    println("----------")
    var dirtyLevel = 19
//    dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
//    dirtyLevel = updateDirty(dirtyLevel) {a -> a + 23}
    dirtyLevel = updateDirty(dirtyLevel, {a -> a + 23})
    println(dirtyLevel)
}
