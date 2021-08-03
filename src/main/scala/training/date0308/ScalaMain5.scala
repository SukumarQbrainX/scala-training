package training.date0308

object ScalaMain5 extends App {

  val list = List(1, 2, 3, 4, 5, 5, 5, 6)

  println(list.exists(_ == 8))
  println(list.forall(_ > 0))
  println(list.count(_ == 5))

  list.zipWithIndex.foreach(f => {
    println(s"element -> ${f._1}", s"Index -> ${f._2}")
  })

  println(list.contains(5))

  val str = list.mkString
  val str1 = list.mkString(", ")
  val str2 = list.mkString("[", ", ", "]")

  println(str)
  println(str1)
  println(str2)
}
