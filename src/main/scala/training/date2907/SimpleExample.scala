package training.date2907

import java.util

object SimpleExample extends App {

  class MyList[T] extends Iterable[T] {

    private[this] val list: util.LinkedList[T] = new util.LinkedList[T]()

    def add(element: T): Unit = {
      list.add(element)
    }

    override def iterator: Iterator[T] = new Iterator[T] {

      private[this] var index = 0

      override def hasNext: Boolean = index < list.size()

      override def next(): T = {
        val output = list.get(index)
        index += 1
        output
      }
    }
  }

  val list: List[Int] = List(1,2,3,4)
  val list1: List[Int] = List.apply(1,2,3,4)

  val myList = new MyList[String]
  myList.add("1")
  myList.add("2")
  myList.add("3")
  myList.add("4")

  for (element <- list) {
    println(element)
  }

  for (element <- myList) {
    println(element)
  }

  val sum = myList.map(_.toInt).sum

  println(sum)
}
