package training.date22

import java.util.Comparator

trait ScalaInterOpInterface extends ScalaClassExample
//  with Comparable[Int]
//with Serializable
//with Cloneable
//with Comparator[Int]
 {

  def add(a: Int, b: Int): Int

  def onePlusTwo(): Unit = println(add(1, 2))

  final def onePlusThree(): Unit = {
    println(add(1, 3))
  }
}

object ScalaInterOpInterface {

  def print(): Unit = println("Scala trait")
}
