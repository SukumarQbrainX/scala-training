package training.date0408

import scala.annotation.tailrec

object ScalaMain1 extends App {

  def calculateSum(input: List[Int]) : Int = {

    @tailrec
    def performComputation(in: List[Int], output: Int = 0): Int = in match {
      case head :: tail => performComputation(tail, output + head)
      case Nil => output
    }

    performComputation(input)
  }

  println(calculateSum(List(1,2,3,4,5)))
}
