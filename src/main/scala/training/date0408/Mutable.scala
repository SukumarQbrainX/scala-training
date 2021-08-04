package training.date0408

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object Mutable extends App {

  var list = List(1,2,3,4)
  println(list)
  list = list :+ 23
  println(list)

  val mutableBuffer: mutable.ArrayBuffer[Int] = ArrayBuffer[Int]()

  println(mutableBuffer)

  mutableBuffer.append(23)

  mutableBuffer += 23

  println(mutableBuffer)

  mutableBuffer.append(34)

  println(mutableBuffer)

  val hashSet: mutable.HashSet[String] = new mutable.HashSet[String]()

  val hashMap: mutable.HashMap[Int, String] = new mutable.HashMap[Int, String]()
}
