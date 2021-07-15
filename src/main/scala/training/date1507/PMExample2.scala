package training.date1507

object PMExample2 extends App {

  val optionInt: Option[Int] = Some(23)
//  val Some(value1) = optionInt
//
//  println(value1)

  optionInt match {
    case x @ Some(value) =>
      println(value.isInstanceOf[Int])
      println(x.isInstanceOf[Some[Int]])
    case None =>
      println("None Value")
  }
}
