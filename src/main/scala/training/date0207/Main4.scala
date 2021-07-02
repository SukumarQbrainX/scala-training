package training.date0207

import scala.util.{Failure, Success, Try}

object Main4 extends App {

  val scalaExample = ScalaExample.apply()
  val scalaExample1: String = ScalaExample()(23)

  ScalaExample[Int]

  val tryInt = Try.apply(1 / 0)
  val tryInt1 = Try(1 / 0)
  val succ = Success.apply(1)
  val succ1 = Success(1)
  val failure = Failure.apply(new Exception)
  val failure1 = Failure(new Exception)

  val optionInt = Option.apply(1)
  val optionInt1 = Option(1)

  println(scalaExample.apply(23))
  println(scalaExample(12))

  val list = List(1, 2, 3, 4, 5)

  println(list(1))
  println(list.apply(1))

  val fxn: Int => String = x => s"Sas + $x"

  println(fxn(12))
  println(fxn.apply(12))

  val a = Some(212)

  val list1 = List(1, 2, 3, 4)
  val list2 = List.apply(1, 2, 3, 4)
}
