package training.date30

import java.util

import scala.annotation.tailrec

object Main2 extends App {

  def find[A](inputList: util.List[A])(fxn: A => Boolean): A = {

    @tailrec
    def compute(index: Int, output: A): A = {
      if (index >= inputList.size || output != null) {
        output
      } else {
        val element: A = inputList.get(index)
        if (fxn(element)) {
          compute(index + 1, element)
        } else {
          compute(index + 1, output)
        }
      }
    }

    compute(0, null.asInstanceOf[A])
  }

  val list = util.Arrays.asList(3,4,5,1,3,20,21,12,13,11)

  val greaterThanFive: Int = find(list)(f => f > 5)

  val list1 = util.Arrays.asList("Hello", "scala", "Java", "C++")

  val scalaName: String = find(list1)(f => f == "scala")

  println(greaterThanFive)
  println(scalaName)
}
