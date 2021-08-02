package training.date0208

import java.util

import scala.collection.immutable.{HashMap, HashSet}

object SeqExample extends App {

  val seq: Seq[Int] = List(1, 2, 3, 4, 5, 6)
  val seq1: Seq[Int] = Array(1, 2, 3, 4, 5, 6)
  val seq2: Seq[Int] = Vector(1, 2, 3, 4, 5, 6, 7)
  val seq3: Seq[Int] = 1 to 10
  val seq4: Seq[Int] = 4 until 45
  val seq5: Seq[Int] = Seq(1,2,3,4,5)
  val seq6: Seq[Int] = Seq.apply(1,2,3,4,5)
  val seq7: Seq[Int] = Seq.fill(1)(2)

  val set: Set[Int] = Set(1, 2, 3, 4, 5, 56)
  val set1: Set[Int] = HashSet(1, 2, 3, 4, 5)

  val map: Map[Int, Int] = Map(1 -> 2)
  val map1: Map[Int, Int] = HashMap(1 -> 4)

  println(map)

  import scala.jdk.CollectionConverters._

  val javaMap: util.Map[Int, Int] = map.asJava
  val scalaMap: Map[Int, Int] = javaMap.asScala.toMap
}
