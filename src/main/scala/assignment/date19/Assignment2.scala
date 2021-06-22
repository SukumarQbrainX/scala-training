package assignment.date19
import java.util
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
  def calculateSumUsingWhileLoop(n: util.List[Int]): Int ={
    val a=n
    var i,sum=0
    var j=a.size()
    while(i <= j-1) {
      sum+=a.get(i)
      i+=1
    }
    sum
  }
  def calculateSumUsingForLoop(n: util.List[Int]): Int ={
    val a=n
    var sum=0
    for(i <- 0 until a.size()){
      sum+=a.get(i)
    }
    sum
  }


}
