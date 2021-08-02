package training.date0208

import scala.collection.immutable.{HashMap, HashSet}

object ListExample extends App {

  val listOfNumbers: List[Int] = scala.collection.immutable.List(1, 2, 3, 4, 5)
  val listOfNumbers1: List[Int] = List.apply(1, 2, 3, 4, 5)

  println(listOfNumbers(1))
  println(listOfNumbers)
  println(listOfNumbers1)

  // fill
  val listOfZero = List.fill(8)(0)

  println(">>>>>>>>>>>>>>>>>")
  println(listOfZero)

  // tabulate
  val tabulatedList: List[String] = List.tabulate(5)(index => s"Index -> $index")
  val tabulatedList1: List[Int] = List.tabulate(5)(index => index + 1)
  val tabulatedList2: List[Int] = List.tabulate(5)(index => index + 2)

  println(">>>>>>>>>>>>>>>")
  println(tabulatedList)
  println(tabulatedList1)
  println(tabulatedList2)

  // empty

  val emptyList: List[Int] = List()
  val emptyList1: List[Int] = List.empty[Int]

  println(">>>>>>>>>>>>>>>>>>>>>>>")

  println(emptyList.isEmpty, emptyList.nonEmpty)
  println(emptyList1.isEmpty, emptyList.nonEmpty)

  val listOfList: List[List[Int]] = List(List(1, 2), List(2, 3))

  def length: Int = {
    println("Asass")
    23
  }

  println(tabulatedList.length)
  println(tabulatedList.size)

  println(length)
  println(length)
  println(length)

  def mapList[T](input: List[Int])(fxn: Int => T): List[T] = {

    Option(input).map(_.map(fxn)).getOrElse(List.empty)
  }

  val outputList: List[String] = mapList(null)(_.toString)
  val outputList1: List[String] = mapList(List(1, 2, 3, 4))(_.toString)

  println(outputList.isEmpty)
  println(outputList1.isEmpty)



}
