package training.date2907

object MapAsIterable extends App {

  val map: Map[String, String] = Map[String, String](
    "hello" -> "asasas",
    "sdasdasdqweqwe" -> null)

  val map2: Map[String, String] = Map[String, String](
    ("hello" , "asasas"),
    ("sdasdasdqweqwe" , null))

  val a: (Int, Boolean) = 1 -> true

  for (element <- map) {
    println(element.isInstanceOf[(String, String)])
    println(element._1)
    println(element._2)
  }

  val list: List[(String, String)] = map.toList

  val map1: Map[String, String] = list.toMap

}