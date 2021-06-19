package assignment.date19

import java.util

object Main {

  def assignment1Run(inputs: util.List[Int]): Unit = {
    println(">>>>>>>>>> Assignment-1 >>>>>>>>>>")
    val assignment1 = new Assignment1
    for (i <- 0 until inputs.size()) {
      println(assignment1.fib(inputs.get(i)))
      println(assignment1.fibTailRec(inputs.get(i)))
    }
    println(">>>>>>>>>> Assignment-1 >>>>>>>>>>")
  }

  def assignment3Run(inputs: util.List[util.List[Int]]): Unit = {
    println(">>>>>>>>>> Assignment-3 >>>>>>>>>>")
    val assignment3 = new Assignment3
    for (i <- 0 until inputs.size()) {
      val fxnInputList = inputs.get(i)
      println(assignment3.calculateMaxGroupSize(fxnInputList))
      println(assignment3.calculateMaxGroupSizeTailRec(fxnInputList))
    }
    println(">>>>>>>>>> Assignment-3 >>>>>>>>>>")
  }

  def main(args: Array[String]): Unit = {
    assignment1Run(util.Arrays.asList(-10, 1, 0, 2, 3, 5, 7))
    assignment3Run(util.Arrays.asList(
      util.Arrays.asList(1, 1, 1, 0, 0, 1, 1),
      util.Arrays.asList(1, 1, 1),
      util.Arrays.asList(0, 1, 1, 0, 1, 0, 1, 1, 1, 0),
      util.Arrays.asList(0, 0, 0),
      util.Arrays.asList(1, 0),
      util.Arrays.asList(0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1)))
  }
}
