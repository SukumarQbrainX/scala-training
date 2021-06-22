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
    println(">>>>>>>>>> Completed >>>>>>>>>>")
  }
  def assignment2Run(input:util.List[util.List[Int]]):Unit={
    println(">>>>>>>>>> Assignment-2 >>>>>>>>>>")
    val assignment2=new Assignment2
    for (i <- 0 until input.size()) {
      val fxnInputList1 = input.get(i)
      println(assignment2.calculateSumUsingForLoop(fxnInputList1))
      println(assignment2.calculateSumUsingWhileLoop(fxnInputList1))
    }
    println(">>>>>>>>>>Completed >>>>>>>>>>")
  }


  def assignment3Run(inputs: util.List[util.List[Int]]): Unit = {
    println(">>>>>>>>>> Assignment-3 >>>>>>>>>>")
    val assignment3 = new Assignment3
    for (i <- 0 until inputs.size()) {
      val fxnInputList = inputs.get(i)
      println(assignment3.calculateMaxGroupSize(fxnInputList))
      //println(assignment3.calculateMaxGroupSizeTailRec(fxnInputList))
    }
    println(">>>>>>>>>> Completed >>>>>>>>>>")
  }
  def assignment4run():Unit={
    println(">>>>>>>>>> Assignment-4 >>>>>>>>>>")
    val a4=new Assignment4
    a4.user("Kannan",9790440453L)
    println(">>>>>>>>>> Completed >>>>>>>>>>")

  }

  def main(args: Array[String]): Unit = {
    assignment1Run(util.Arrays.asList(-10, 1, 0, 2, 3, 5, 7))

    assignment2Run(util.Arrays.asList(util.Arrays.asList(-10, 1, 0, 2, 3, 5, 7),
      util.Arrays.asList(-10),
      util.Arrays.asList(-10, 8,-1),
      util.Arrays.asList(1, 2, 3, 4)))

    assignment3Run(util.Arrays.asList(util.Arrays.asList(1, 1, 1, 0, 0, 1, 1),
      util.Arrays.asList(1, 1, 1),
      util.Arrays.asList(0, 1, 1, 0, 1, 0, 1, 1, 1, 0),
      util.Arrays.asList(0, 0, 0),
      util.Arrays.asList(1, 0),
      util.Arrays.asList(0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1)))
    assignment4run()

  }

}
