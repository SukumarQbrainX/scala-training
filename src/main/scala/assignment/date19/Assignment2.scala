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

  def calculateSumUsingWhileLoop(numbers : Int*) : Long = {
    var counter = 0
    var sum = 0
    while (counter < numbers.size) {
      sum += numbers(counter)
      counter += 1
    }
    sum
  }

  def calculateSumUsingForLoop(numbers : Int*) : Long = {
    var sum = 0
    for (i <- 0 until numbers.size) {
     // println("i:" + i +", numbers(i)" + numbers(i))
      sum += numbers(i)
    }
    sum
  }
}
