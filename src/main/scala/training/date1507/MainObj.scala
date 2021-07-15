package training.date1507

object MainObj extends App {

  case class Example()

  case object ExampleObjCase

  object ExampleObj

  println(ExampleObj)
  println(ExampleObjCase)

  val a = ExampleObj

  println(a.isInstanceOf[Serializable])
}
