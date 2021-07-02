package training.date0107

import java.util

import scala.annotation.tailrec
import scala.util.control.Breaks.{break, breakable}

object Main extends App {

  def takeWhile[A](inputList: util.List[A])(f: A => Boolean): util.List[A] = {

    @tailrec
    def compute(index: Int, output: util.List[A]): util.List[A] = {
      if (index >= inputList.size() || !f(inputList.get(index))) {
        output
      } else {
        output.add(inputList.get(index))
        compute(index + 1, output)
      }
    }

    compute(0, new util.LinkedList[A]())
  }

  println(takeWhile(util.Arrays.asList(2, 3, 4, 6, 1, 2, 3))(f => f > 1))
  println(List(2, 3, 4, 6, 1, 2, 3).takeWhile(f => f > 1))

//  //   Kannan Solution
//  def takeWhile1[A](listofAnytype: util.List[A])(fun: A => Boolean): util.List[A] = {
//    val tempList = new util.LinkedList[A]()
//    breakable {
//      for (i <- 0 until listofAnytype.size()) {
//        val element = listofAnytype.get(i)
//        if (fun(element)) {
//          tempList.add(element)
//        }
//        else {
//          break
//        }
//      }
//    }
//    tempList
//  }

}
