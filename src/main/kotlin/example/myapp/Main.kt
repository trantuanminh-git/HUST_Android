package example.myapp

fun buildAquarium() {
    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

//fun testMySecondWithContext() {
//    GlobalScope.lanch(Dispatcher.IO) {
//
//    }
//}

fun main() {
    buildAquarium()
//    val job1: Job =
}