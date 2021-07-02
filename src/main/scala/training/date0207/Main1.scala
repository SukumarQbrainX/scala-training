package training.date0207

import scala.util.{Failure, Success, Try}

object Main1 extends App {

  val a: Try[Int] = Try.apply(1 / 0)

  val b: Try[Int] = Success.apply(1)
  val c: Try[Nothing] = Failure.apply(new Exception("sadasd"))

  println(a.toOption)

  val a1: Try[String] =  a.map(f => f.toString)


}
