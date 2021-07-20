package training.date2007

import scala.util.Try
import ImplicitsScala._

object ScalaMain4 extends App {

  val a: String = "1234 2345"

  val b: Int = a.splitAndAdd

//  println(b)

  println(a.head)
  println(a.tail)
  val a1: IndexedSeq[Int] = a.map(x => Try(x.toInt))
    .filter(f => f.isSuccess)
    .map(f => f.get)

  println(a1)

  println("1".toDouble)
}
