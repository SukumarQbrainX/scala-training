package training.date0807

import scala.util.{Failure, Success, Try}

object Main3 extends App {

  val applyExample: ApplyExample = ApplyExample(122)("asas")
//
  val ApplyExample(a2: Double, a3: String) = applyExample
//  val ApplyExample(a4, a5: Double) = applyExample

  val a1: Option[Int] = Option(122)

  val Some(value: Int) = a1

  println(value)

  val b1: Try[Int] = Try(throw new Exception)

  val Failure(val1: Throwable) = b1

  println(b1)

  val1.printStackTrace()

  val a: (Int, Double) = (23, 44.7)

  val b: (Int, Double) = 23 -> 44.7

  val c: ((Int, String), Boolean) = 26 -> "dasdasd" -> true
  val d: (Int, String, Boolean) = (11, "Sdasd", false)

//  val a: Option[Double] = ApplyExample.unapply(applyExample)(23)

//  println(a2)
//  println(a3)
}
