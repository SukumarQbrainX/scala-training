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
   def calculateSumUsingWhileLoop(n: util.List[Int]):Int= {
    var i, sum = 0
    val nw=n
    var l=nw.size()
    while (i <=l-1) {
      sum = sum+ nw.get(i)
      i+=1
    }
    sum
  }
  def calculateSumUsingForLoop (n: util.List[Int]):Int= {
    var sum = 0
    val nw=n
    for (i <-0 until  nw.size()) {
      sum = sum + nw.get(i)
    }
    sum
  }
}
object Main2 {
  def assignment2Run(inputs: util.List[util.List[Int]]): Unit = {
    println(">>>>>>>>>> Assignment-2 >>>>>>>>>>")
    val assignment2 = new Assignment2
    for (i <- 0 until inputs.size()) {
      val fxnInputList = inputs.get(i)
       println(assignment2.calculateSumUsingWhileLoop(fxnInputList))
     println(assignment2.calculateSumUsingForLoop(fxnInputList))
    }
    println(">>>>>>>>>> Assignment-2 >>>>>>>>>>")
  }

  def main(args: Array[String]): Unit = {

    assignment2Run(util.Arrays.asList(
      util.Arrays.asList(-10),
      util.Arrays.asList(-10, 8, - 1),
      util.Arrays.asList(1, 2, 3, 4)))

  }
  }


