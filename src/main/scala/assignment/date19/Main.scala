
package assignment.date19

import AssignmentDate19.{Assignment1, Assignment2, Assignment3, Assignment4}

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

 def assignment2Run() : Unit = {
    println(">>>>>>>>>> Assignment-2 >>>>>>>>>>")
    val assignment2 = new Assignment2
    println(assignment2.calculateSumUsingWhileLoop(-10))
    println(assignment2.calculateSumUsingWhileLoop(-10, 8, -1))
    println(assignment2.calculateSumUsingWhileLoop(1, 2, 3, 4))

    println(assignment2.calculateSumUsingForLoop(-10))
    println(assignment2.calculateSumUsingForLoop(-10, 8, -1))
    println(assignment2.calculateSumUsingForLoop(1, 2, 3, 4))
    println(">>>>>>>>>> Assignment-2 >>>>>>>>>>")
  }

  def assignment3Run(in:util.List[util.List[Int]]):Unit={
    println(">>>>>>>>>>>>>>Assignment3>>>>>>>>>>>>>>")

    val assignment3=new Assignment3
    for(i<-0 until in.size())
    {
      val value=in.get(i)
      println(assignment3.calculateMaxGroupSize(value))
      println(assignment3.calculateMaxGroupSizeTailRec(value))

    }
  }

  def assignment4Run(): Unit = {
    println(">>>>>>>>>>>>Assignment4>>>>>>>>.")
    val assignment4 = new Assignment4
    assignment4.user("Akash", 8888545698l)


  }

  def main(args: Array[String]): Unit = {
    assignment1Run(util.Arrays.asList(-10, 1, 0, 2, 3, 5, 7))
    assignment2Run()

    assignment3Run(util.Arrays.asList(
      util.Arrays.asList(1, 1, 1, 0, 0, 1, 1),
      util.Arrays.asList(1, 1, 1),
      util.Arrays.asList(0, 1, 1, 0, 1, 0, 1, 1, 1, 0),
      util.Arrays.asList(0, 0, 0),
      util.Arrays.asList(1, 0),
      util.Arrays.asList(0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1)))


  assignment4Run()



  }
}
