package training.date0207

import java.util
import java.util.Optional

import scala.jdk.OptionConverters._
import scala.jdk.CollectionConverters._

object Main3 extends App {

  val scalaOption: Option[Int] = Option.apply(1223)
  val javaOptional: Optional[Int] = scalaOption.toJava
  val scalaOption1: Option[Int] = javaOptional.toScala

  val scalaList = List.apply(1, 2, 3, 4)
  val scalaSet = Set.apply(1, 2, 3, 4)
  val scalaMap = Map.apply(1 -> "asas", 2 -> "asas", 3 -> "asas", 4 -> "asas")

  val javaList: util.List[Int] = scalaList.asJava
  val javaSet: util.Set[Int] = scalaSet.asJava
  val javaMap: util.Map[Int, String] = scalaMap.asJava

  val scalaMap1: Map[Int, String] = javaMap.asScala.toMap

  val scalaList2: List[Int] = scalaList :+ 23

  println(scalaList)
  println(scalaList2)

  val scalaList3 = scalaList2.zipWithIndex.foreach(f => println(f._1, f._2))
}
