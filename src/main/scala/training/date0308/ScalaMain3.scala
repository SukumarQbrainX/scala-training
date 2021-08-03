package training.date0308

object ScalaMain3 extends App {

  val a = List((1, "Hello"), (1, "Scala"), (2, "Java"))

  val a1 = a.toMap

  val a2: Map[Int, List[String]] =
    a.groupBy(_._1)
      .view.mapValues(_.map(_._2)).toMap

  println(a2)


}
