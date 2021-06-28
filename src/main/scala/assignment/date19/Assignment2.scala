package assignment.date19

/**
 * Create methods in such a way that it can take any number
 * of arguments and calculate sum.
 *  
 * For eg:-
 *    input            |   output
 *    -10                   -10
 *    -10, 8, -1            -3
 *    1, 2, 3, 4            10
 * 
 * Fxn description :-
 *   1. calculateSumUsingWhileLoop :- write the logic using while loop.
 *   2. calculateSumUsingForLoop :- write the logic using for loop.
 *   
 * Note :-
 *  in object `Main` write a function named "assignment2Run()"
 *  and write a logic to print the output on console.
 */
class Assignment2 {
   def calculateSumUsingWhileLoop(n:Int*):Int= {
    var ct = 0
    var sum = 0
    while (ct < n.size) {
      sum += n(ct)
      ct += 1
    }
    sum
  }
  def calculateSumUsingForLoop (n: Int*):Int= {
    var sum = 0
    for (i <-0 until n.size) {
      sum = sum + n(i)
    }
    sum
  }
}

object Main2 {
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
  def main(args: Array[String]): Unit = {
    assignment2Run()
  }
}


