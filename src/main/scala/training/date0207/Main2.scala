package training.date0207

import scala.util.{Failure, Success, Try}

object Main2 extends App {

  val input = "1drgdfg11"

  val triedInt: Try[Int] = Try.apply(input.toInt)

  println(triedInt)

  println(divide2ByInput("0"))

  def divide2ByInput(input: String): Try[Int] = {
    val triedInt: Try[Int] = Try.apply(input.toInt)
    if (triedInt.isSuccess) {
      Try.apply(2 / triedInt.get )
    } else {
      Failure.apply(triedInt.failed.get)
    }
  }

  val a1: Try[Try[Int]] = Try("Asas".toInt).map(f => Try.apply(2 / f))

  val a2: Try[Int] = Try("123".toInt).flatMap(f => Try(2 / f))

  val a3: List[Int] = List(1,2,3,4).flatMap(f => List(f,f,f))
  val a4: List[List[Int]] = List(1,2,3,4).map(f => List(f,f,f))

  println(a3)
  println(a4)

  println(a2)

  val list = List(1,2,3,4,5)

  val list1: List[Int] = list.flatMap(f => List(f,f,f,f))

  println(list1)

  val list2: List[List[Int]] = list.map(f => List(f,f,f,f))

  println(list2)

  val list3: List[Int] = list2.flatten

  println(list3)
}
