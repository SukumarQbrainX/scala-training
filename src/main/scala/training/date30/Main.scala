package training.date30

import java.util

object Main extends App {

  def map[A, B](inputList: java.util.List[A])
               (fxn: A => B): util.List[B] = {
    val list: util.List[B] = new util.LinkedList[B]()
    for (i <- 0 until inputList.size) {
      list.add(fxn(inputList.get(i)))
    }
    list
  }

  val linkedList: util.List[Int] = util.Arrays.asList(1,2,3,4,5,6)

  val linkedList1: util.List[Int] = map(linkedList)(f => f * 2)

  val linkedList2: util.List[String] = map(linkedList)(f => s"Number -> $f")

  val linkedList3: util.List[Double] = map(linkedList)(f => f * 2.0)

  val linkedList4 = map[Int, String](linkedList1)(f => f.toHexString)

  println(linkedList)
  println(linkedList1)
  println(linkedList2)
  println(linkedList3)
  println(linkedList4)
}
