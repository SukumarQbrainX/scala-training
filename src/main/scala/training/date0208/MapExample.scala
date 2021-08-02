package training.date0208

object MapExample extends App {

  val map: Map[Int, String] = scala.collection.immutable.Map(1 -> "Hello", 2 -> "Aakash")
  val map1: Map[Int, String] = Map.apply(1 -> "Hello", 2 -> "Aakash")
  val map2: Map[String, Int] = Map.empty
}
