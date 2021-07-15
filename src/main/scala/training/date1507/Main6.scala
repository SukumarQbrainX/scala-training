package training.date1507

import scala.util.{Failure, Success, Try}

object Main6 extends App {

  def twentyDivideByX(x: Int): Int = 20 / x

  Try(twentyDivideByX(1)) match {
    case Success(value: Int) => println(value)
    case Failure(exception: Throwable) =>
      exception.printStackTrace()
  }

  val triedOptionOfInt: Try[Option[Int]] = Try(None)

  triedOptionOfInt match {
    case Success(value: Option[Int]) if value.isDefined  => println(value)
    case Success(value: Option[Int]) if value.isEmpty  => println("No Value")
    case Failure(exception) =>
      exception.printStackTrace()
  }

  triedOptionOfInt match {
    case Success(Some(value: Int)) => println(value)
    case Success(None) => println("No Value")
    case Failure(exception) =>
      exception.printStackTrace()
  }

  val a1: Option[Int] = Option(1)

  a1 match {
    case Some(1) => println("One")
    case Some(2) => println("Two")
    case Some(value) => println("value")
    case None => println("No value")
  }
}
