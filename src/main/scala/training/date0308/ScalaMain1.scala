package training.date0308

import scala.annotation.tailrec

object ScalaMain1 extends App {

  val list = List(1, 2, 3, 4, 5, 6)

  // sum
  println(list.sum)

  // foldLeft & foldRight

  val string: String = list.foldLeft("Initial String - ")((prev, current) => prev + " -- " + current)
  val string1: String = list.foldRight("Initial String - ")((prev, current) => prev + " -- " + current)

  println(string)

  println(string1)

  @tailrec
  def foldLeft[A, B](z: A, list: List[B])(fxn: (A, B) => A): A = {
    if (list.isEmpty) {
      z
    } else {
      foldLeft(fxn(z, list.head), list.tail)(fxn)
    }
  }

  println(foldLeft(0, List(1,2,3,4,5))(_ + _))

  val output = foldLeft(" ", List("Hello", "Scala"))(_ + _)

  println(output)
}
