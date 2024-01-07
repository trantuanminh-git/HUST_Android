package example.myapp

//abstract class AquariumFish {
//    abstract val color: String
//}
interface FishColor {
    val color: String
}
interface FishAction  {
    fun eat()
}
object GoldColor : FishColor {
    override val color = "gold"
}
class PrintFishAction(val food: String): FishAction {
    override fun eat() {
        println(food)
    }
}
class Shark: FishColor, FishAction {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}

//class Plecostomus: FishColor by GoldColor, FishAction {
//    override fun eat() {
//        println("eat algae")
//    }
//}
// -----------------------
//class Plecostomus(fishColor: FishColor = GoldColor):  FishAction,
//        FishColor by fishColor {
//    override fun eat() {
//        println("eat algae")
//    }
//}
// -----------------------
class Plecostomus(fishColor: FishColor = GoldColor):
        FishAction by PrintFishAction("eat algae"),
        FishColor by GoldColor